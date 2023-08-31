class PassportRunner {
  
  
  public static void main(String args[]){
	  
	  
	  
	  Passport passport = new Passport("Benagaluru","Dhananjay","24/9/2001","dhanu@gmail.com","Dhanan","Dhanan");
	 /* passport.passportOffice="Benagaluru";
	  passport.givenName="Dhananjay";
	  passport.dob="24/9/2001";
	  passport.email="dhanu@gmail.com";
	  passport.password="Dhan";
	  passport.confirmPassword="Dhan";*/
	  
	  passport.validatePassword(passport.password,passport.confirmPassword);
  }
}