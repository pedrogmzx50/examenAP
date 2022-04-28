package hospitales;

import java.util.ArrayList;

import oms.OMS;

public class HospitalNicoya extends OMS{

	public HospitalNicoya(ArrayList pPacientes)
	{
		super("MEXICO");
		this.setArrayPacientes(pPacientes);
	}
	@Override
	public boolean isGamHospital() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hospital getNombreHospital() {
		// TODO Auto-generated method stub
		return getNombreHospital();
	}

}
