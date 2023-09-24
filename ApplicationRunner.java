class ApplicationRunner {
	
	public static void main(String args[]){
		
		Application apps= new Application();
		apps.setName("PhonePe");
		apps.setSizeInMb(150.8);
		apps.setVersion("V0998.11");
		apps.setRatings("4.5");
		apps.setNoOfDownloads("200M+");
		apps.setCampanyName("Google");
		PlayStore store =new PlayStore();
		//has-A relationship
		store.application=apps;
		store.managedBy=("Google");
		
		System.out.println("app name: "+store.application.getName());
		System.out.println("Size: "+store.application.getSizeInmb());
		System.out.println("Version:"+store.application.getVersion());
		System.out.println("Ratings:"+store.application.getRatings());
		System.out.println("Number of downloads: "+store.application.getNoOfDownloads());
		System.out.println("Company Name:"+store.application.getCampanyName());
		System.out.println(store.managedBy);
		
		
	}
}