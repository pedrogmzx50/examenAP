package pacientes;

public final class Paciente {//

	private final String nombrePaciente;
	private final int edad;
	private final int temperatura;
	private final boolean vomito;
	
// Constructor
	public Paciente() {
		
		this.nombrePaciente="";
		this.edad = 0;
		this.temperatura = 0;
		this.vomito = false;
	}
	
public Paciente(String pNombrePaciente, int pEdad, int pTemperatura, boolean pVomito ) {
		
		this.nombrePaciente= pNombrePaciente;
		this.edad = pEdad;
		this.temperatura = pTemperatura;
		this.vomito = pVomito;
	}
//Getters
public String getNombrePaciente() {
	return nombrePaciente;
}

public int getEdad() {
	return edad;
}

public int getTemperatura() {
	return temperatura;
}

public boolean isVomito() {
	return vomito;
}
	
	
	
}
