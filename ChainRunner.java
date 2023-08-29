class ChainRunner {
	
	 public static void main(String c[]){
		 Chain chain = new Chain();
		 chain.chainType= "Gold";
		 chain.price=100000;
		 chain.chainGram=45;
		 chain.discount="20%";
		 chain.ShopName="Abharana";
		 
		 System.out.println("Chain type is "+ chain.chainType);
		 System.out.println("Chain price is "+ chain.price);
		 System.out.println("Chain gram is " + chain.chainGram);
		 System.out.println("discount is " +  chain.discount);
		 System.out.println("ShopName is " + chain.ShopName);
		 
		 chain.perchaseChain();
		 System.out.println("\n");
		 
		 
		 Chain chain1 = new Chain();
		 chain1.chainType= "Silver";
		 chain1.price=10000;
		 chain1.chainGram=30;
		 chain1.discount="50%";
		 chain1.ShopName="Joyalukkus";
		 
		 System.out.println("Chain1 type is "+ chain1.chainType);
		 System.out.println("Chain1 price is "+ chain1.price);
		 System.out.println("Chain1 gram is " + chain1.chainGram);
		 System.out.println("discount is " +  chain1.discount);
		 System.out.println("ShopName is " + chain1.ShopName);
		 
		 chain1.perchaseChain();
		 System.out.println("\n");
		 
		 Chain chain2 = new Chain();
		 chain2.chainType= "Platinum";
		 chain2.price=150000;
		 chain2.chainGram=10;
		 chain2.discount="30%";
		 chain2.ShopName="Abharana";
		 
		 System.out.println("Chain2 type is "+ chain2.chainType);
		 System.out.println("Chain2 price is "+ chain2.price);
		 System.out.println("Chain2 gram is " + chain2.chainGram);
		 System.out.println("discount is " +  chain2.discount);
		 System.out.println("ShopName is " + chain2.ShopName);
		 
		 chain2.perchaseChain();
		 System.out.println("\n");
		 
		 Chain chain3 = new Chain();
		 chain3.chainType= "UmaGold";
		 chain3.price=100;
		 chain3.chainGram=30;
		 chain3.discount="10%";
		 chain3.ShopName="footPath";
		 
		 System.out.println("Chain3 type is "+ chain3.chainType);
		 System.out.println("Chain3 price is "+ chain3.price);
		 System.out.println("Chain3 gram is " + chain3.chainGram);
		 System.out.println("discount is " +  chain3.discount);
		 System.out.println("ShopName is " + chain3.ShopName);
		 
		 chain3.perchaseChain();
		 System.out.println("\n");
		 
		 Chain chain4 = new Chain();
		 chain4.chainType= "Dimond";
		 chain4.price=1306000;
		 chain4.chainGram=45;
		 chain4.discount="20%";
		 chain4.ShopName="Malbar gold and dimond";
		 
		 System.out.println("Chain4 type is "+ chain4.chainType);
		 System.out.println("Chain4 price is "+ chain4.price);
		 System.out.println("Chain4 gram is " + chain4.chainGram);
		 System.out.println("discount is " +  chain4.discount);
		 System.out.println("ShopName is " + chain4.ShopName);
		 
		 chain4.perchaseChain();
		 System.out.println("\n");
	 }
}