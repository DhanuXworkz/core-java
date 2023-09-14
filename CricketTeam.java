class CricketTeam {
	String playersNames[]=new String[11];
	int index;
	
	public boolean addPlayer(String playersName){
		boolean isAdded=false;
		if(index<playersNames.length){
			
			
			
		if(playersName!=null){
			boolean exists=checkIfplayerNameExists(playersName);
			if(exists==false){
				
			System.out.println("Validation is proper....  add player");
			playersNames[index]=playersName;
			index++;
			isAdded=true;
			System.out.println("added sucessfully");
			
		}
		else{
			System.out.println(playersName+ " player name is Already exists");
		}
		}
		else{
			System.out.println("in Cricket  team we can add only 11 member can not add the player further");
		}
		
		
	}
	return isAdded;
	
	}
	
	public void getPlayer(){
		for(int index =0;index<playersNames.length;index++){
			System.out.println(playersNames[index]);
			
		}
	}
	
	public boolean checkIfplayerNameExists(String playersName){
		System.out.println("inside checkIfplayerNameExists");
		boolean exists= false;
		for(int index=0;index<playersNames.length;index++){
			if(playersNames[index]==playersName){
				exists= true;
			}
		}
		return exists;
	}

}
