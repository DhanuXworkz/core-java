class Airport {
	String airportName;
	String airportLocation;
	int airlinesServed;
	String runwayLength;
	String airportCode;
	
	public Airport(String airportName,String airportLocation,int airlinesServed,String runwayLength,String airportCode){
	
	this.airportName=airportName;
	this.airportLocation=airportLocation;
	this.airlinesServed=airlinesServed;
	this.runwayLength=runwayLength;
	this.airportCode=airportCode;
	
	System.out.println("\n airportName is "+ airportName);
	System.out.println("\n airportLocation is  "+ airportLocation);
	System.out.println("\n airlinesServed are " + airlinesServed);
	System.out.println("\n runwayLength is "+ runwayLength);
	System.out.println("\n airportCode is "+airportCode);
}
}