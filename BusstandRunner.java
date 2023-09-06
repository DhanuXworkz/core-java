class BusstandRunner {
	
	public static void main(String args[]){
	
	Busstand stand =new Busstand();
	stand.setBusstandId(4);
	stand.setBusstandName("kempegowda");
	stand.setNoOfFlaotform(50);
	stand.setLocation("Bengaluru");
	stand.setManagerName("Chandu");
	
	System.out.println("Bus stand Id :"+stand.getBusstandId());
	System.out.println("Bus stand Name :"+stand.getBusstandName());
	System.out.println("Number of floatform : "+stand.getNoOfFlaoform());
	System.out.println("Bus stand Location :"+stand.getLocation());
	System.out.println("Bus stand Manager Name :"+stand.getManagerName());
}
}