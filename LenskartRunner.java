class LenskartRunner {
	public static void main(String len[]){
		Lenskart lens = new Lenskart();
		lens.brandName="vincent";
		lens.price=2000;
		lens.color="transperent";
		lens.size="medium";
		
		System.out.println("lens brandName is " +lens.brandName);
		System.out.println("lens price is " + 		lens.price);
		System.out.println("lens  color is " + lens.color);
		System.out.println(" lens size is " + lens.size);
		
		lens.provideLenses();
		System.out.println("\n");
		
		Lenskart lens1 = new Lenskart();
		lens1.brandName="Ray ban";
		lens1.price=5000;
		lens1.color="transperent";
		lens1.size="medium";
		
		System.out.println("lens1 brandName is " +lens1.brandName);
		System.out.println("lens1 price is " + 		lens1.price);
		System.out.println("lens1  color is " + lens1.color);
		System.out.println(" lens1 size is " + lens1.size);
		
		lens1.provideLenses();
		System.out.println("\n");
		
		Lenskart lens2 = new Lenskart();
		lens2.brandName="Oakley";
		lens2.price=2390;
		lens2.color="Black";
		lens2.size="Small";
		
		System.out.println("lens2 brandName is " +lens2.brandName);
		System.out.println("lens2 price is " + lens2.price);
		System.out.println("lens2  color is " + lens2.color);
		System.out.println(" lens2 size is " + lens2.size);
		
		lens2.provideLenses();
		System.out.println("\n");
		
		
		Lenskart lens3 = new Lenskart();
		lens3.brandName="Carrera";
		lens3.price=400;
		lens3.color="blue";
		lens3.size="Medium";
		
		System.out.println("lens3 brandName is " +lens3.brandName);
		System.out.println("lens3 price is " + lens3.price);
		System.out.println("lens3  color is " + lens3.color);
		System.out.println(" lens3 size is " + lens3.size);
		
		lens3.provideLenses();
		System.out.println("\n");
		
		
		Lenskart lens4 = new Lenskart();
		lens4.brandName="Jacobs";
		lens4.price=4000;
		lens4.color="Transperent";
		lens4.size="Medium";
		
		System.out.println("lens4 brandName is " +lens4.brandName);
		System.out.println("lens4 price is " + lens4.price);
		System.out.println("lens4  color is " + lens4.color);
		System.out.println(" lens4 size is " + lens4.size);
		
		lens4.provideLenses();
		System.out.println("\n");
		
		
		
	}


}