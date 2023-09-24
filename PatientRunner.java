class PatientRunner{
	public static void main(String[] pat){

	Patient patient=new Patient();
	patient.setPatientId(457);
	patient.setPatientName("Mia");
	patient.setDiseases("Fever");
	patient.setDocName("Jonny");


	Hospital hospital=new Hospital();
	hospital.patient=patient;
	hospital.hospitalName="Sarji";

	System.out.println("Hospital Name : "+hospital.hospitalName);
	System.out.println("Patient Id : "+hospital.patient.getPatientId());
	System.out.println("Patient Name : "+hospital.patient.getPatientName());
	System.out.println("Diseases : "+hospital.patient.getDiseases());
	System.out.println("Doctor name : "+hospital.patient.getDocName());

	}
}