class Mixer {
	
	static boolean mode;
	static int minSpeed;
	static int maxSpeed=3;
	static int currentSpeed;
	
	public static boolean onOrOff(){
		if(mode==false){
			mode=true;
			System.out.println("Mixer is on");
		}
		else if(mode==true){
			mode=false;
			System.out.println("Mixer is off");
		}
		return mode;
	}
	public static void increaseSpeed(){
		if(mode==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("currentSpeed is "+ currentSpeed);
			}
			else {
				System.out.println("maxSpeed Reached");
		}
		}
		else {
			System.out.println("Please on the Mixer");
		}
	}
	
	public static void decreaseSpeed(){
		if(mode==false){
			if(currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("currentSpeed is "+ currentSpeed);
			}
			else {
				System.out.println("minSpeed Reached");
		}
		}
		else {
			System.out.println("Please on the Mixer");
		}
	}
		
				
			



}