class Dunzo1Runner{
	
	
	public static void main(String donzo[]){
		double price =Dunzo1.find("Ghee Roast");
		System.out.println("the price is " +price);
		
		double pricewithquantity =Dunzo1.find("Ghee Roast",6);
		System.out.println("the price is " +pricewithquantity);
	}

}