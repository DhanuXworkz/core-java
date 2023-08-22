
class Speaker {
	static String speakerBrand = "GOVO";
	 static boolean isConnected =false;// bcz speaker 1st time off
	 static int maxVolume =8;
	 static int currentVolume;
	 static int minVolume;
	 
	 public static void main(String spea[])
	 {
		 System.out.println("Main started");
		 
		 System.out.printl("Speaker Brand "+ speakerBrand);
		 
		 
		 System.out.println("Speaker connection status");
		 
		   isConnected =true;
		   
		  
		 System.out.println("Is speaker is Connected " + isConnected);
		 
		   isConnected =false;
		   
		 
		  
		 System.out.println("Is speaker is Connected " + isConnected);
		  
		  currentVolume= currentVolume + 1;
		  
		 
		 
		 
		 System.out.println("Main ended");
		 
	 }
	 
}