class CricketTeam {
	String playersNames[]=new String[11];
	int index;
	
	public boolean addPlayer(String playersName){
		boolean isAdded=false;
		if(playersName!=null){
			playersNames[index]=playersName;
			index++;
			isAdded=true;
			
		}
		return isAdded;
		
	}
	public void getPlayer(){
		for(int index =0;index<playersNames.length;index++){
			System.out.println(playersNames[index]);
			
		}
	}
}