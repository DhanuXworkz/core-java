class ChatShop {
	
	String chatsNames[]= new String[10];
	int index;
	
	public boolean addChatName(String chatsName){
		
		boolean isAdded=false;
		if(index<chatsNames.length){
		if(chatsName !=null){
			boolean exists = checkIfChatsNameExists(chatsName);
			if(exists == false){
			System.out.println("valitation is proper..proced to add the songs Names");
			chatsNames[index]=chatsName;
			index++;
			isAdded=true;
			System.out.println(chatsName+"Chat Name added sucessfully");
		}
		else{
			System.out.println(chatsName+"  is already exists");
		}
		}
		}
		else {
			System.out.println("Array size is over cant add the chats further");
		}
		System.out.println("End of addChatName");
		return isAdded;
		
	}
	public void getChatsName(){
		for(int index=0;index<chatsNames.length;index++){
			System.out.println(chatsNames[index]);
			
		}
	}
	
	public boolean checkIfChatsNameExists(String chatsName){
		boolean exists=false;
		for(int index=0;index<chatsNames.length;index++){
			if(chatsNames[index]==chatsName){
				exists =true;
				
			}
		}
		System.out.println("End of addMovieName Method\n");
			return exists;
		}
	
	
}