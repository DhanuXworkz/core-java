class PatientRunner {
	
	public static void main(String arg[]){
		Patient patient =new Patient();
		patient.setPatientId(1);
		patient.setPatientName("Sunny");
		patient.setNurseName("Mia");
		patient.setAge(24);
		patient.setGender("Female");
		patient.setDisease("Aids");
		patient.setWardNumber(15);
		patient.setHospitalName("Kims");
		patient.setPatientAddress("Avnde Mane");
		patient.setAdmitDate("12-06-2023");
		patient.setDoctorName("Johny");
		
		System.out.println("patient ID: "+patient.getPatientId());
		
		System.out.println("Name :"+patient.getPatientName());
		System.out.println("Nurse Name :"+patient.getNurseName());
		System.out.println("Age :"+patient.getAge());
		System.out.println("Gender :"+patient.getGender());
		System.out.println("Disese:"+patient.getDisease());
		System.out.println("Ward Number:"+patient.getWardNumber());
		System.out.println("Hospital Name:"+patient.getHospitalName());
		System.out.println("Address:"+patient.getPatientAddress());
		System.out.println("Admit Date:"+patient.getAdmitDate());
		System.out.println("Doctor Name:"+patient.getDoctorName());
		
		
	}


}