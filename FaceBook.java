class FaceBook{
	
 
   public static void main(String[] args)
 {
	System.out.println("Welcome to FaceBook");
	login("dhananjayksdhanu@gmail.com", "pass213");
    login(8088995832L, "password@321");
 }	
 public static void login( String emailId, String password)              
 {
 System.out.println("Login with emialId");
 }
 public static void login( long phoneNumber, String password)
 {
 System.out.println("Login with phoneNumber");
  }	
 }