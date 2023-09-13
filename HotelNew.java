class HotelNew {
	
	String foodMenu[]=new String[10];
	int index;
	
	
	public boolean addFood(String foodName){
		
		boolean isAdded=false;
		if(foodName !=null){
			System.out.println("valitation is proper");
			foodMenu[index]=foodName;
			index++;
			isAdded=true;
			
		}
		return isAdded;
		
	}
	public void getFood(){
		for(int index =0;index<foodMenu.length;index++){
			System.out.println(foodMenu[index]);
			
		}
		
	}
	
}