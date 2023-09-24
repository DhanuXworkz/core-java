class PassengersRunner{
	
	public static void main(String args[]){
		Passengers person =new Passengers();
		person.setPassengerName("Dhanu");
		person.setAge(22);
		person.setGender("Male");
		person.setGetingIn("Sagara");
		person.setDestination("Bengaluru");
		
		
		Train train=new Train();
		train.passengers=person;
		train.trainName=("Talaguppa Express");
		
		System.out.println("Name:"+person.getPassengerName());
		System.out.println("Age:"+person.getAge());
		System.out.println("Gender:"+person.getGender());
		System.out.println("Starting point:"+person.getGetingIn());
		System.out.println("Destination:"+person.getDestination());
		
		
		System.out.println(train.trainName);
		
	}
}