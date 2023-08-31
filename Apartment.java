class Apartment {
	
	int apartmentId;
	String apartmentName;
	String location;
	int noOfFloors;
	int noOfTwoBhkFlats;
	int noOfThreeBhkFlats;
	public Apartment( int apartid,String name,String loc,int foolr,int twobhk,int threebhk){
		apartmentId=apartid;
		apartmentName=name;
		location=loc;
		noOfFloors=foolr;
		noOfTwoBhkFlats=twobhk;
		noOfThreeBhkFlats=threebhk;
		
		System.out.println("apartment ID is " + apartmentId);
		System.out.println("apartment Name is " + apartmentName);
		System.out.println("apartment location is " + location );
		System.out.println("apartment  has" + noOfFloors + "floors");
		System.out.println("apartment has " + noOfTwoBhkFlats + " noOfTwoBhkFlats");
		System.out.println("apartment has " + noOfThreeBhkFlats + " noOfThreeBhkFlats");
		
	}
	
	public static void provideAccomadation(){
		System.out.println("two provide the large space to the peoples");
	}
	
}