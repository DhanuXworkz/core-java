class ApartmentRunner {
	
	public static void main(String a[]){
		//new keyword is used create object
		//ClassName reference variable  =new ClassName();
		Apartment apartment = new Apartment();
		apartment.apartmentId =1;
		apartment.apartmentName ="prestige";
		apartment.location ="Whitefield";
		apartment.noOfFloors=45;
		apartment.noOfTwoBhkFlats=120;
		apartment.noOfThreeBhkFlats=100;
		
		System.out.println("apartment ID is " + apartment.apartmentId);
		System.out.println("apartment Name is " + apartment.apartmentName);
		System.out.println("apartment location is " + apartment.location );
		System.out.println("apartment  has" + apartment.noOfFloors + "floors");
		System.out.println("apartment has " + apartment.noOfTwoBhkFlats + " noOfTwoBhkFlats");
		System.out.println("apartment has " + apartment.noOfThreeBhkFlats + " noOfThreeBhkFlats");
		
		apartment.provideAccomadation();
		System.out.println("\n");
		
		
		Apartment apartment1 =new Apartment();
		apartment1.apartmentId =2;
		apartment1.apartmentName="Prestige";
		apartment.location="RajajiNagar";
		apartment1.noOfFloors=43;
		apartment1.noOfTwoBhkFlats = 140;
		apartment1.noOfThreeBhkFlats =104;
		
	    System.out.println("apartment1 ID is " + apartment1.apartmentId);
		System.out.println("apartment1 Name is " + apartment1.apartmentName);
		System.out.println("apartment1 location is " + apartment1.location );
		System.out.println("apartment1  has" + apartment1.noOfFloors + "floors");
		System.out.println("apartment1 has " + apartment1.noOfTwoBhkFlats + " noOfTwoBhkFlats");
		System.out.println("apartment1 has " + apartment1.noOfThreeBhkFlats + " noOfThreeBhkFlats");
		
		
		
		
		apartment1.provideAccomadation();
		System.out.println("\n");
		
		Apartment apartment2 = new Apartment();
		apartment2.apartmentId =3;
		apartment2.apartmentName ="prestige";
		apartment2.location ="jpNagar";
		apartment2.noOfFloors=30;
		apartment2.noOfTwoBhkFlats=110;
		apartment2.noOfThreeBhkFlats=50;
		
		 System.out.println("apartment2 ID is " + apartment2.apartmentId);
		System.out.println("apartment2 Name is " + apartment2.apartmentName);
		System.out.println("apartment2 location is " + apartment2.location );
		System.out.println("apartment2  has" + apartment2.noOfFloors + "floors");
		System.out.println("apartment2 has " + apartment2.noOfTwoBhkFlats + " noOfTwoBhkFlats");
		System.out.println("apartment2 has " + apartment2.noOfThreeBhkFlats + " noOfThreeBhkFlats");
		
		apartment2.provideAccomadation();
		System.out.println("\n");
		
		
		Apartment apartment3 = new Apartment();
		apartment3.apartmentId =4;
		apartment3.apartmentName ="Dmart";
		apartment3.location ="RRNagar";
		apartment3.noOfFloors=13;
		apartment3.noOfTwoBhkFlats=50;
		apartment3.noOfThreeBhkFlats=40;
		
		 System.out.println("apartment3 ID is " + apartment3.apartmentId);
		System.out.println("apartment3 Name is " + apartment3.apartmentName);
		System.out.println("apartment3 location is " + apartment3.location );
		System.out.println("apartment3  has" + apartment3.noOfFloors + "floors");
		System.out.println("apartment3 has " + apartment3.noOfTwoBhkFlats + " noOfTwoBhkFlats");
		System.out.println("apartment3 has " + apartment3.noOfThreeBhkFlats + " noOfThreeBhkFlats");
		
		apartment3.provideAccomadation();
		System.out.println("\n");
		
		
		Apartment apartment4 = new Apartment();
		apartment4.apartmentId =5;
		apartment4.apartmentName ="Shobha";
		apartment4.location ="rarjinagar";
		apartment4.noOfFloors=25;
		apartment4.noOfTwoBhkFlats=70;
		apartment4.noOfThreeBhkFlats=40;
		
		 System.out.println("apartment4 ID is " + apartment4.apartmentId);
		System.out.println("apartment4 Name is " + apartment4.apartmentName);
		System.out.println("apartment4 location is " + apartment4.location );
		System.out.println("apartment4  has" + apartment4.noOfFloors + "floors");
		System.out.println("apartment4 has " + apartment4.noOfTwoBhkFlats + " noOfTwoBhkFlats");
		System.out.println("apartment4 has " + apartment4.noOfThreeBhkFlats + " noOfThreeBhkFlats");
		
		apartment4.provideAccomadation();
		
	}
}