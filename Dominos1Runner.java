class Dominos1Runner {
	public static void main(String domino[]){
		
		double price = Dominos1.search("Rest and Cool Pizza");
		System.out.println("the price is " + price);
		
		double pricewithquantity = Dominos1.search("Rest and Cool Pizza",2);
		System.out.println("the price is " + pricewithquantity);
	}
}