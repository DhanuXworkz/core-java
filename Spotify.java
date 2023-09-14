class Spotify {
	
	String songNames[]=new String [11];
	int index;
	
	public boolean addKannadaSongs(String songName){
		System.out.println("invoked addKannadaSong()");
		
		boolean isAdded = false;
	
		if(index<songNames.length){
		if(songName!=null){
			boolean exists = checkIfSongNameExists(songName);
			if(exists == false){
				System.out.println("validation is proper .. now add the songs");
			songNames[index]=songName;
			index++;
			isAdded=true;
			System.out.println(songName+" is added succesfully");
			
		}
		else{
			System.out.println(songName+ " is already exists");
		}
		}
		}

		else{
			System.out.println("memory full con't add the songs ");
			
		}
		return isAdded;
		
	
	}
	public void getKannadaSongs(){
		for(int index=0;index<songNames.length;index++){
			System.out.println(songNames[index]);
			
		}
	}
	public boolean checkIfSongNameExists(String songName){
		System.out.println("invoked the checkIfSongNameExists");
		boolean exists = false;
		for(int index=0; index<songNames.length; index++){
			if(songNames[index]==songName){
				exists = true;
			}
				
		}
		return exists;
		
	}
	
}
