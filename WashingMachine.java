class WashingMachine {
	
	static boolean mode;
	static int minTemperature;
	static int maxTemperature=4;
	static int currentTemperature;
	
	public static boolean onOrOff(){
		if(mode==false){
			mode=true;
			System.out.println("WashingMachine is On");
		}
		else if (mode==true){
			mode=false;
			System.out.println("WashingMachine is off");
		}
		return mode;
	}
	public static void increaseTemperature(){
		if(mode==true){
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("currentTemperature is "+currentTemperature);
			}
		else {
			System.out.println("currentTemperature Reached");
		}
		}
		else{
			System.out.println("Please On your WashingMachine");
		}
	}
	public static void decreaseTemperature(){
		if(mode==true){
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("currentTemperature is "+currentTemperature);
			}
		else {
			System.out.println("minTemperature Reached");
		}
		}
		else {
			System.out.println("Please On your WashingMachine");
		}
			
}
}