class HotelNew {
	
	String foodMenu[]=new String[10];
	int index;
	
	
	public boolean addFood(String foodName){
		
		boolean isAdded=false;
		if(index<foodMenu.length){
			
			//paanipoori!=null
		if(foodName !=null){
			 boolean exists=checkIffoodNameExists(foodName);
			 if(exists==false){
			System.out.println("valitation is proper ... add the foodName ");
			foodMenu[index]=foodName;
			index++;
			isAdded=true;
			System.out.println(foodName+"added sucessfully");
			
		}
		else{
			System.out.println(foodName+" is already exists");
		}
		}
		}
		else
		{
			System.out.println("Only 10  foodnames in the foodmenu can't add food further");
		}
		System.out.println("End of addFood Method\n");
		return isAdded;
		
	}
	public void getFood(){
		for(int index =0;index<foodMenu.length;index++){
			System.out.println(foodMenu[index]);
			
		}
		
	}
	public boolean checkIffoodNameExists(String foodName){
		boolean exists=false;
		for(int index=0;index<foodMenu.length;index++){
			if(foodMenu[index]==foodName){
				exists=true;
			}
		}
		return exists;
	}
	
}