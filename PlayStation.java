class PlayStation{
	int id;
	String name;
	int noOfJoysticks;
	int noOfGames;
	String typesOfGames;
	
	 public PlayStation(int id,String name,int noOfJoysticks,int noOfGames,String typesOfGames ){
		 this.id=id;
		 this.name=name;
		 this.noOfJoysticks=noOfJoysticks;
		 this.noOfGames=noOfGames;
		 this.typesOfGames=typesOfGames;
		 
		 
		 System.out.println("\nplay Station ID " + id);
		 System.out.println("\nPlay sation name "+name);
		 System.out.println("\nNumber of joy Sticks " +noOfJoysticks);
		 System.out.println("\nNumber of games "+noOfGames);
		 System.out.println("\nTypes of Games "+typesOfGames);
	 }
	
	
}