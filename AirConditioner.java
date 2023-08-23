class AirConditioner {
	
	static boolean isConnected;
	static int minTemperarture;
	static int maxTemperature = 6;
	static int currentTemperature;
	
	public static boolean onAndOff(){
		if( isConnected==false){
			isConnected=true;
			System.out.println("AC is on");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("AC is off");
		}
		return isConnected;
	}
	
   public static void increaseTemperature(){
	   if(isConnected==true){
		   if(currentTemperature<maxTemperature){
			   currentTemperature = currentTemperature +1;
			   System.out.println("currentTemperature is "+ currentTemperature);
		   }
		   else{
			   System.out.println("maxTemperature is Reached");
		   }
	   }
	   else{
		   System.out.println("please turn on the AC");
	   }
   }
   
   public static void decreaseTemperature(){
	   if(isConnected== true){
		   if(currentTemperature>minTemperarture){
			   currentTemperature = currentTemperature-1;
			   System.out.println("currentTemperature is "+currentTemperature);
		   }
		   else{
			   System.out.println("minTemperarture is Reached");
		   }
	   }
	   else{
		   System.out.println("Plese on the AC");
	   }
   }
}


		   
		   
	
			
		
		


