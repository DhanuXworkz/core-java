class Interior {
	
	String materialNames[] =new String[11];
	int index;
	
	public boolean addMaterial(String materialName){
		boolean isAdded=false;
		if(materialName!=null){
			materialNames[index]=materialName;
			index++;
			isAdded=true;
			
		}
		return isAdded;
	}
	
	public void getMaterial(){
		for(int index=0;index<materialNames.length;index++){
			System.out.println(materialNames[index]);
		}
	}
}