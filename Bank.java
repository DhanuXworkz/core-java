class Bank {
	private int bankId;
	private String bankName;
	private String bankLocation;
	private String bankIFSCCode;
	private String bankManager;
	private int noOfStatf;
	private long contactNumber;
	
	
	public void setBankId(int bankId){
		this.bankId=bankId;
	}
	public int getBankId(){
		return bankId;
	}
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankName(){
		return bankName;
	}
	public void setBankLocation(String bankLocation){
		this.bankLocation=bankLocation;
	}
	public String getBankLocation(){
		return bankLocation;
	}
	public void setBankIFSCCode(String bankIFSCCode){
		this.bankIFSCCode=bankIFSCCode;
	}
	public String getBankIFSCCode(){
		return bankIFSCCode;
	}
	public void setBankManager(String bankManager){
		this.bankManager=bankManager;
		
	}
	public String getBankManager(){
		return bankManager;
	}
	public void setNoOfStatf(int noOfStatf){
		this.noOfStatf=noOfStatf;
	}
	public int getNoOfStatf(){
		return noOfStatf;
	}
	public void setContactNumber(long contactNumber){
		this.contactNumber=contactNumber;
	}
	
	public long getContactNumber(){
		return contactNumber;
	}
	
	
}