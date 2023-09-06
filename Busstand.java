class Busstand {
	
	private int busstandId;
	private String busstandName;
	private int noOfFlaotform;
	private String location;
	private String managerName;
	
	
	public void setBusstandId(int busstandId){
		this.busstandId=busstandId;
		
	}
	
	public int getBusstandId(){
		return busstandId;
	}
	
	public void setBusstandName(String busstandName){
		this.busstandName=busstandName;
		
	}
	public String getBusstandName(){
		return busstandName;
		
	}
	
	public void setNoOfFlaotform(int noOfFlaotform){
		this.noOfFlaotform=noOfFlaotform;
		
	}
	
	public int getNoOfFlaoform(){
		return noOfFlaotform;
		
	}
	
	public void setLocation(String location){
		this.location=location;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setManagerName(String managerName){
		this.managerName=managerName;
		
	}
	public String getManagerName(){
		return managerName;
	}
	
}