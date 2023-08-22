class JustEatRunneer1 {
	public static void main (String Dh[])
	{
		double price=JustEat1.search("Rosogolla");
		System.out.println("the price is " + price);
		
		double pricewithquantity=JustEat1.search("Rosogolla",4);
		System.out.println("the price is with quantity" + pricewithquantity);
	}
}