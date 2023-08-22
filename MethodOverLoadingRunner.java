class MethodOverLoadingRunner {
	
	public static void main(String as[]){
		
		double price = MethodOverLoading.search("Pizza");
		System.out.println("the price is " + price);
		
		double pricewithquantity =MethodOverLoading.search("Pizza",6);
		System.out.println("the price with quantity is "+ pricewithquantity);
	}
}