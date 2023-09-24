class Passengers {
	
	private String passengerName;
	private int age;
	private String gender;
	private String getingIn;
	private String destination;
	
	
	public void setPassengerName(String passengerName){
		this.passengerName=passengerName;
		
	}
	public String getPassengerName(){
		return passengerName;
	}
	
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
	
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}
	
	public void setGetingIn(String getingIn){
		this.getingIn=getingIn;
	}
	public String getGetingIn(){
		return getingIn;
		
	}
	
	public void setDestination(String destination){
		this.destination=destination;
	}
	public String getDestination(){
		return destination;
	}
	
}