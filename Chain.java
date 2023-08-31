class Chain {
	
	 String chainType;
	 int price ;
	 int chainGram;
	 String discount;
	 String shopName;
	 public Chain(String type,int cost,int weigt,String dis,String name){
		 chainType=type;
		 price=cost;
		 chainGram=weigt;
		 discount=dis;
		 shopName=name;
		 
		 System.out.println("Chain type is "+ chainType);
		 System.out.println("Chain price is "+ price);
		 System.out.println("Chain gram is " + chainGram);
		 System.out.println("discount is " +  discount);
		 System.out.println("ShopName is " +shopName);
	 }
	  
	
	public static void perchaseChain(){
		System.out.println("Enhance your beaty");
		
	}
	
}