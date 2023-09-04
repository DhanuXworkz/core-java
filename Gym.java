class Gym {
	int gymId;
	String name;
	String location;
	int noOfEquipments;
	int noOfTrainers;
	
	public Gym(int gymId,String name,String location,int noOfEquipments,int noOfTrainers){
		
		this.gymId=gymId;
		this.name=name;
		this.location=location;
		this.noOfEquipments=noOfEquipments;
		this.noOfTrainers=noOfTrainers;
		
		System.out.println(" Gym ID "+gymId);
		System.out.println("Gym Name "+name);
		System.out.println("Gym Location "+noOfEquipments);
		System.out.println("Number of equipments "+noOfEquipments);
		System.out.println("Number of Trainer "+noOfTrainers);
		
	}
}