class Fan{
	
	
	static boolean isConnected;
	static int maxSpeed =6;
	static int minSpeed;
	static int currentSpeed;
	public static boolean onOrOff(){
	
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("Fan is Turned on...");
		}
		
		else if(isConnected == true){
			isConnected = false;
			System.out.println("Fan is Turned !");
			 
		}
	
		
		return isConnected;
	}
	
	public static void increaseSpeed(){
	
		
		if(isConnected==true){
			if(currentSpeed < maxSpeed){
				
				currentSpeed=currentSpeed+1;
				System.out.println("the currentSpeed is " +currentSpeed);
			}
				else{
				
					System.out.println("the Maximum Speed Reached");
				}
		}
				else{
					
						System.out.println("Please turn on the Fan");
					}
				
				}
				
				public static void decreaseSpeed(){
	
					
					if(isConnected == true){
						if(currentSpeed > minSpeed){
							currentSpeed =currentSpeed-1;
							System.out.println("minSpeed is " + currentSpeed);
						}
						else{
						System.out.println("minSpeed Reached");
					}
					}
		
					else{
						System.out.println("Please turn on the Device");
					}
					}
					
					
				
				
				
				
}
		

