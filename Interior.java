class Interior {
	
	String materialNames[] =new String[11];
	int index;
	
	public boolean addMaterial(String materialName){
		System.out.println("inside the addMaterial()");
		boolean isAdded=false;
		if(index <materialNames.length){
			
		
		if(materialName!=null){
			boolean exists= allMatrialsexits(materialName);
			if(exists ==false){
				
			materialNames[index]=materialName;
			System.out.println(materialName+" Material added sucessfully");
			index++;
			isAdded=true;
			
		}
		else{
			System.out.println(materialName +"is already exists");
		}
		}
		}
		else{
		System.out.println("array index out of bounds expectiom //materialName size full cont add further ");
	}
		return isAdded;
	}
	
	
	public void getMaterial(){
		System.out.println("materialName are :");
		for(int index=0;index<materialNames.length;index++){
			System.out.println(materialNames[index]);
		}
	}
	public boolean allMatrialsexits(String materialName){
		boolean exists=false;
		for(int index=0; index<materialNames.length;index++){
			if(materialNames[index]==materialName){
				exists=true;
			}
			
		}
		return exists;
		
	}
}