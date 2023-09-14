class OttPlatForm {
	String movieNames[]=new String[4];
	int index;//instance variable
	
	//create/add/save operation
	
	public boolean addMoviesName(String movieName){
		System.out.println("Inside the movieNames()");
		boolean isAdded=false;//local variable it shoul be initialize at the time of declarartion
		if(index<movieNames.length){
		if(movieName != null){
			boolean exists = checkIfMovieNameExits(movieName);
			if (exists==false){
			System.out.println("valitation is proper");
			movieNames[index]=movieName;
			index++;
			isAdded=true;
			
			
		
		}
		else {
			System.out.println(movieName+" movieName already exists");
		}
		}
		}
		else {
			System.out.println("index out of bound exceeds");
		}
		System.out.println(movieName+ " add movieName ended");
		return isAdded;
		
		
	}
	

	
	//read
	public void getMoviesName(){
		for(int index=0; index<movieNames.length;index++){
			System.out.println(movieNames[index]);
			
		}
		
	}
	public boolean checkIfMovieNameExits(String movieName){
		
		boolean exists=false;
			for(int index=0; index<movieNames.length;index++){
				if(movieNames[index]==movieName){
					exists =true;
				
			}
		}
		return exists;
		
	}
	
}