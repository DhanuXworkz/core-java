class MethodOverLoading {
	
	public static double search(String foodName){
		
		double price =0.00;
		System.out.println("search invoked : foodName (String)");
		 if(foodName=="Pizza"){
			 price=120.00;
			 
		 }
		 
		 if(foodName=="dose"){
			 price=40.00;
		 }
		 System.out.println("search Ended");
	
	return price;
	}
	
	public static double search(String foodName,int quantity){
		
		double price =0.00;
		System.out.println("search invoked : foodName (String)");
		 if(foodName=="Pizza"){
			 price=120.00*quantity;
			 
		 }
		 
		 if(foodName=="dose"){
			 price=40.00*quantity;
		 }
		 System.out.println("search Ended");
	
	return price;
	}
	
}