class  Lenskart {
	
	 String brandName;
	 int price;
	 String color;
	 String size;
	  public Lenskart(String brandyname,int pice,String colour,String siz){
		  brandName=brandyname;
		  price=pice;
		  color=colour;
		  size=siz;
		  
		 System.out.println("lens brandName is " +brandName);
		System.out.println("lens price is " + price);
		System.out.println("lens  color is " + color);
		System.out.println(" lens size is " + size);
		  
	  }
	 
	 public Lenskart(){
		 System.out.println("constructor called");
	 }
	 
	
	public static void provideLenses(){
		System.out.println("DO MoRE.. BE MORE");
		
	}
	
}