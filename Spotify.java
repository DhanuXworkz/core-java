class Spotify {
	
	String songNames[]=new String [11];
	int song;
	
	public boolean addKannadaSongs(String songName){
		
		boolean isAdded = false;
		if(songName!=null){
			songNames[song]=songName;
			song++;
			isAdded=true;
			
		}
		return isAdded;
		
	}
	public void getKannadaSongs(){
		for(int index=0;index<songNames.length;index++){
			System.out.println(songNames[index]);
			
		}
	}
	
}