package pruebasCovid;

import pacientes.Paciente;

public final class PruebaPCR implements PruebaCovid19{
	private Paciente paciente;
	public PruebaPCR(Paciente pPaciente) {
		this.paciente = pPaciente; //Composicion
	}
	
	
	@Override
	public boolean isPositive() {
		if((this.paciente.getTemperatura() >= 38) && (this.paciente.isVomito()))
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
