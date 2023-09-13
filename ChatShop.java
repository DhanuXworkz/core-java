class ChatShop {
	
	String chatsNames[]= new String[10];
	int index;
	
	public boolean addChatName(String chatsName){
		
		boolean isAdded=false;
		
		if(chatsName !=null){
			System.out.println("valitation is proper");
			chatsNames[index]=chatsName;
			index++;
			isAdded=true;
		}
		return isAdded;
		
	}
	public void getChatsName(){
		for(int index=0;index<chatsNames.length;index++){
			System.out.println(chatsNames[index]);
			
		}
	}
	
}