class Udyanavan{
	String udyanavanName;
	int udyanavanId;
	String flowersName[];
	int noOfWorkers;
	int noOfGates;
	
	public Udyanavan(String udyanavanName,int udyanavanId,String flowersName[],int noOfWorkers,int noOfGates){
		this.udyanavanName=udyanavanName;
		this.udyanavanId=udyanavanId;
		this.flowersName=flowersName;
		this.noOfWorkers=noOfWorkers;
		this.noOfGates=noOfGates;
		
		System.out.println("\nudyanavan Name is "+ udyanavanName);
		System.out.println("\nudyanavan Id is " +udyanavanId);
		
		//System.out.println("\n flowersName is "+ flowersName);
		System.out.println("\nNumber Of Workers is "+ noOfWorkers);
		System.out.println("\nNumber of Gates is "+ noOfGates);
		
	}
	public void getFlowers(){
		for(int index=0; index<flowersName.length; index++){
			System.out.println(flowersName[index]);
		}
	}
	
	public void getFlowers1(){
		for(int index=0; index<flowersName.length; index++){
			System.out.println(flowersName[index]);
		}
	}
	
	public void getFlowers2(){
		for(int index=0; index<flowersName.length; index++){
			System.out.println(flowersName[index]);
		}
	}
	
	public void getFlowers3(){
		for(int index=0; index<flowersName.length; index++){
			System.out.println(flowersName[index]);
		}
	}
	
	
	public void getFlowers4(){
		for(int index=0; index<flowersName.length; index++){
			System.out.println(flowersName[index]);
		}
	}


}