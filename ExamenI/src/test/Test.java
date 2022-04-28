package test;

import java.util.ArrayList;

import hospitales.HospitalMexico;
import hospitales.HospitalNicoya;
import oms.OMS;
import pacientes.Paciente;

public class Test {

	public static void main(String[] args) {
		ArrayList pCientesMexico = new ArrayList<Paciente>();
		ArrayList pCientesNicoya = new ArrayList<Paciente>();
		//String pNombrePaciente, int pEdad, int pTemperatura, boolean pVomito 
		Paciente pacienteX = new Paciente("Juan M", 23,  38, false);
		Paciente pacienteY = new Paciente("Maria M", 60,  39, true);
		Paciente pacienteZ = new Paciente("Rodrigo M", 30,  37, false);
		pCientesMexico.add(pacienteX);
		pCientesMexico.add(pacienteY);
		pCientesMexico.add(pacienteZ);
		String cadena = "MEXICO";
		HospitalMexico hospMex = new HospitalMexico(pCientesMexico);
		hospMex.imprimirReporte();
		
		// -------- -------- --------- ---------- -------- --------
		
		Paciente pacienteA = new Paciente("Alondra N", 24,  38, false);
		Paciente pacienteB = new Paciente("Pedro N", 25,  39, true);
		Paciente pacienteC = new Paciente("Marianela N", 30,  37, false);
		pCientesNicoya.add(pacienteA);
		pCientesNicoya.add(pacienteB);
		pCientesNicoya.add(pacienteC);
		cadena = "NICOYA";
		HospitalNicoya hospNic = new HospitalNicoya(pCientesNicoya);
		hospMex.imprimirReporte();
		
	}
}
