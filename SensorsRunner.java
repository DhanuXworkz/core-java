class SensorsRunner {
	
	 public static void main(String n[]){
		 
		 Sensors sensor = new Sensors("Image Sensors","640*480hz","linear",2019);
		/* sensor.type="Image Sensors";
		 sensor.Resolution="640*480hz";
		 sensor.linearity="linear";
		 sensor.manufacturedYear=2019;
		 
		 
		 System.out.println("type " + sensor.type);
		 System.out.println("Resolution "+sensor.Resolution);
		 System.out.println("linearity"+sensor.linearity);
		 System.out.println("manufacturedYear "+sensor.manufacturedYear);*/
		 sensor.detectingDevice();
		 
		 
		  Sensors sensor1 = new Sensors("pressure Sensors","64*80hz","linear",2018);
		 /*sensor1.type="pressure Sensors";
		 sensor1.Resolution="64*80hz";
		 sensor1.linearity="linear";
		 sensor1.manufacturedYear=2018;
		 
		 
		 System.out.println("type " + sensor1.type);
		 System.out.println("Resolution "+sensor1.Resolution);
		 System.out.println("linearity"+sensor1.linearity);
		 System.out.println("manufacturedYear "+sensor1.manufacturedYear);*/
		 sensor1.detectingDevice();
		 
		 
		  Sensors sensor2 = new Sensors("Level Sensors","640*480hz","linear",2022);
		 /*sensor2.type="Level Sensors";
		 sensor2.Resolution="640*480hz";
		 sensor2.linearity="linear";
		 sensor2.manufacturedYear=2022;
		 
		 
		 System.out.println("type " + sensor2.type);
		 System.out.println("Resolution "+sensor2.Resolution);
		 System.out.println("linearity"+sensor2.linearity);
		 System.out.println("manufacturedYear "+sensor2.manufacturedYear);*/
		 sensor2.detectingDevice();
		 
		 
		  Sensors sensor3 = new Sensors("Photo Sensors","69*80hz","linear",2000);
		 /*sensor3.type="Photo Sensors";
		 sensor3.Resolution="69*80hz";
		 sensor3.linearity="linear";
		 sensor3.manufacturedYear=2000;
		 
		 
		 System.out.println("type " + sensor3.type);
		 System.out.println("Resolution "+sensor3.Resolution);
		 System.out.println("linearity"+sensor3.linearity);
		 System.out.println("manufacturedYear "+sensor3.manufacturedYear);*/
		 sensor3.detectingDevice();
		 
		 
		 
		  Sensors sensor4 = new Sensors("Position Sensors","540*980hz","non linear",2019);
		/* sensor4.type="Position Sensors";
		 sensor4.Resolution="540*980hz";
		 sensor4.linearity="non linear";
		 sensor.manufacturedYear=2019;
		 
		 
		 System.out.println("type " + sensor4.type);
		 System.out.println("Resolution "+sensor4.Resolution);
		 System.out.println("linearity"+sensor4.linearity);
		 System.out.println("manufacturedYear "+sensor4.manufacturedYear);*/
		 sensor4.detectingDevice();
		 
		 
	 }
}