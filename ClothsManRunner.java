class ClothsManRunner {
	
	public static void main(String args[]){
		
		String brands[] ={"Puma","USPOLO","Decothlon","Peter England"};
		
		
		ClothsMan cloths = new ClothsMan(1,6,"Rajaji Nagar",brands);
	
		/*cloths.id =1;
		cloths.noOfWorkers=6;
		cloths.location="Rajaji Nagar";
		cloths.brands=brands;

		System.out.println(cloths.id );
        System.out.println(cloths.noOfWorkers);	
        System.out.println(cloths.location);*/
        
		cloths.sellingCloths();
		
		System.out.println("available brands are:");
		
		cloths.getAllBrands(cloths.brands);
}
}