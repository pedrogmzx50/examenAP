package hospitales;

public enum Hospital {	
	NICOYA("Hospital Nicoya")
	,	MEXICO("Hospital Mexico"); 
	
	private final String hospitalNombre;
	
	private Hospital(String pHospital) {
		this.hospitalNombre = pHospital;
	
	}
	 public String getHospitalNombre()
	 {
		 return hospitalNombre;
	 }
	
}
