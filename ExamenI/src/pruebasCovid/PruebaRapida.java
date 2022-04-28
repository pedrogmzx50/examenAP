
package pruebasCovid;

import pacientes.Paciente;

public  class PruebaRapida implements PruebaCovid19 {
	
	private Paciente paciente;
	public PruebaRapida(Paciente pPaciente) {
		this.paciente = pPaciente; //Composicion
	}
	@Override
	public boolean isPositive() {
		if((this.paciente.getTemperatura() >= 38) && (this.paciente.getEdad() >= 60))
		{
			return true;
		}
		return false;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.paciente.getNombrePaciente();
	}
	
}
