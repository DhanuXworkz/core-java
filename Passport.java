class Passport {

   String passportOffice;
    String givenName;
	String dob;
	String email;
	String password;
	String confirmPassword;
	
	public Passport(String passport, String name,String Janmadinanka,String e,String failword,String malarikodu){
		passportOffice=passport;
		givenName=name;
		dob=Janmadinanka;
		email=e;
	   password=failword;
	   confirmPassword=malarikodu;
		
	}
	
	 public Passport()
	 {
		 System.out.println(" passport object is created");
	 }
	
	
	public boolean verifyPassword(String password, String confirmPassword){
		
		boolean isPasswordVerfied= false;
		
		if(password == confirmPassword){
			isPasswordVerfied =true;
			displayDetails();
		}

	
		else{
			System.out.println("Type mismmatch password is wrong");
			
			
		}
		
		return isPasswordVerfied;
		
		
		
		
	}
	
	public void displayDetails(){
		System.out.println("passportOffice:" +passportOffice);
		System.out.println("givenName: " + givenName);
		System.out.println("dob:" + dob);
		System.out.println("email:"+email);
		System.out.println("password:"+password);
		System.out.println("confirmPassword:"+confirmPassword);
	}
	
	public void validatePassword(String password,String confirmPassword){
		int minLength=6;
		
		
		int maxLength=16;
		int passwordLength= password.length();
		int confirmPasswordLength= confirmPassword.length();
		
		if(passwordLength>=minLength && passwordLength<=maxLength){
			if(confirmPasswordLength>=minLength && passwordLength<=maxLength){
			System.out.println("Valid password");
			verifyPassword(password,confirmPassword);
			
		}
		}
		
		
	
	
	    else {
		System.out.println("Invalid length of Password");
	}

	}

}