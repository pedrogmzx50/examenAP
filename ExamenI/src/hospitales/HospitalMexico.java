package hospitales;

import java.util.ArrayList;

import oms.OMS;

public class HospitalMexico extends OMS {
	
	public HospitalMexico(ArrayList pPacientes)
	{
		super("MEXICO");
		this.setArrayPacientes(pPacientes);
	}
	@Override
	public boolean isGamHospital() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Hospital getNombreHospital() {
		// TODO Auto-generated method stub
		return getNombreHospital();
	}

}
