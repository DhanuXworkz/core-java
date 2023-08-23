class Televission {
	
	static boolean mode;
	static int minVolume;
	static int maxVolume=7;
	static int currentVolume;
	
	public static boolean onOrOff(){
		if(mode==false){
			mode=true;
			System.out.println("Tv is On");
		}
		else if (mode==true){
			mode=false;
			System.out.println("TV is off");
		}
		return mode;
	}
	public static void increaseVolume(){
		if(mode==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("currentVolume is "+currentVolume);
			}
		else {
			System.out.println("maxVolume Reached");
		}
		}
		else{
			System.out.println("Please On your TV");
		}
	}
	public static void decreaseVolume(){
		if(mode==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("currentVolume is "+currentVolume);
			}
		else {
			System.out.println("minVolume Reached");
		}
		}
		else {
			System.out.println("Please On your TV");
		}
			
}
}