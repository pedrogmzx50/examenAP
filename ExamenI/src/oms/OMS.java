package oms;

import java.util.ArrayList;

import hospitales.Hospital;
import pacientes.Paciente;
import pruebasCovid.PruebaPCR;
import pruebasCovid.PruebaRapida;

public abstract class OMS { //Similar a patron Template
	private Hospital hospital;
	public OMS(String pHospital ) 
	{ 
		switch(pHospital){
		case "MEXICO":
				this.hospital = Hospital.MEXICO;
			break;
		case "NICOYA":
				this.hospital = Hospital.NICOYA;
			break;
		}
		
	}
	private ArrayList pacientes = new ArrayList<Paciente>();
	private ArrayList pruebasPCR = new ArrayList<String>();
	private ArrayList pruebasRapida = new ArrayList<String>();
	
	public abstract boolean isGamHospital();
	public abstract Hospital getNombreHospital();
	private void diagnosticar(Hospital pHospital, Paciente pPaciente)
	{
		String resultado = "";
		if(pHospital.getHospitalNombre() =="Hospital Mexico")//Se le aplica PCR
		{
			PruebaPCR prueba = new PruebaPCR(pPaciente);
			if(prueba.isPositive())
			{
				System.out.println("El pacientes es positivo :c");
				//pruebasPCR.add("true"); //El resultado se guarda, ya sea verdadero o falta
				
			}else {
				System.out.println("El pacientes es negativo c:");
				//pruebasPCR.add("false");
			}
			resultado =  prueba.getNombre() + String.valueOf(prueba.isPositive()) ;
			pruebasPCR.add(resultado);
		}else { // Es Hospital Nicoya, se aplica la prueba rapida
			PruebaRapida prueba = new PruebaRapida(pPaciente);
			if(prueba.isPositive())
			{
				System.out.println("El pacientes es positivo :c");
				//pruebasRapida.add("true"); //El resultado se guarda, ya sea verdadero o falta
			}else {
				System.out.println("El pacientes es negativo c:");
				//pruebasRapida.add("false");
			}
			resultado =  prueba.getNombre() + String.valueOf(prueba.isPositive()) ;
			pruebasRapida.add(resultado);
		}
	}
	public final void imprimirReporte()
	{
		System.out.print("Hospital: "+this.hospital.getHospitalNombre());
		if(this.hospital.getHospitalNombre()=="Hospital Mexico")
		{
			pruebasPCR.forEach((n) -> System.out.println(n));
			
		}else {
			pruebasRapida.forEach((n) -> System.out.println(n));
		}
	
	}
	public void setArrayPacientes(ArrayList pPacientes)
	{
		this.pacientes = pPacientes;
	}

}
