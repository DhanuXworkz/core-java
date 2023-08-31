class ClothsMan {
	 
	 int id;
	 int noOfWorkers;
	 String  brands[];
	 String location;
	 
	 public ClothsMan( int idd, int Workers,String area,String[] brandy){
		 id=idd;
		 noOfWorkers=Workers;
		 brands=brandy;
		 location=area;
		 
		 System.out.println("Cloth id is "+id );
        System.out.println("workes "+noOfWorkers);	
        System.out.println("Location "+location);
		 
	 }
	 
	 public ClothsMan(){
		 System.out.println("ClothsMan object is created");
	 }
	 
	 public void sellingCloths(){
	 }
	  
	  public void doBusiness(){
	  }
	  
	  public void getAllBrands(String brands[]){
		   for( int index =0; index<brands.length; index++){
			   System.out.println(brands[index]);
		   }
		  
	  }
}

