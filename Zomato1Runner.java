class Zomato1Runner {
	
	public static void main(String zom[]){
		
		double price =Zomato1.search("Bhindi Masala");
		System.out.println("The Price is" + price);
		
		double pricewithquantity =Zomato1.search("Bhindi Masala",4);
		System.out.println("the price with number of quantity" + pricewithquantity);
		
		
		

	}
	}