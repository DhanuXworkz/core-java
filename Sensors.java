class Sensors {
	String type;
	String Resolution;
	String linearity;
	int manufacturedYear;
	public Sensors(String tpe,String rev,String linear,int mfd){
		type=tpe;
		Resolution=rev;
		linearity=linear;
		manufacturedYear=mfd;
	
		 System.out.println("type " + type);
		 System.out.println("Resolution "+Resolution);
		 System.out.println("linearity"+linearity);
		 System.out.println("manufacturedYear "+manufacturedYear);
		
	}
	public Sensors(){
		System.out.println("Constracter is called");
	}
	public static void detectingDevice(){
		System.out.println("Device is detect and responds to some type of input from the physical environment");
	}
}