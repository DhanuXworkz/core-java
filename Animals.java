class Animals{

  static String animals[] ={"Tiger","Lion","Chethah","Deer","Camel","Zeebra"};
  
   public static void main(String animal[])
   {
	   System.out.println("main started");
	   
	   System.out.println("animals.length");
	   
	   for(int ani =animals.length-1; ani >=0;ani--) 
	   {
		   System.out.println(animals[ani]);
	   }
		   System.out.println("Main Ended");
   }
}
		   
	   