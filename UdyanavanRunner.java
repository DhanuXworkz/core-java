class UdyanavanRunner {
	
		public static void main(String arg[]){
		String flowers[]={"Rose","Tulip","Sunflower","Lily","Daisy","Orchid","Carnation","Peony","Hydrangea","Marigold"};
		String flowers1[]={"Hibiscus","Daffodil","Chrysanthemum","Iris","Gerbera","Bluebell","Foxglove","Magnolia","Poppy","Pansy"};
		String flowers2[]={"Rose","Tulip","Sunflower","Lily","Daisy","Orchid","Carnation","Peony","Hydrangea","Marigold"};
		String flowers3[]={"Hibiscus","Daffodil","Chrysanthemum","Iris","Gerbera","Bluebell","Foxglove","Magnolia","Poppy","Pansy"};
		String flowers4[]={"Rose","Tulip","Sunflower","Lily","Daisy","Orchid","Carnation","Peony","Hydrangea","Marigold"};
		
		Udyanavan park =new Udyanavan("Lalbagh Botanical Garden",1,flowers,40,5);
		park.getFlowers();
		
		Udyanavan park1 =new Udyanavan("Brindavan Gardens",2,flowers1,30,7);
		park1.getFlowers1();
		
		Udyanavan park2 =new Udyanavan("Government Botanical Garden",3,flowers2,20,9);
		park2.getFlowers2();
		
		
		Udyanavan park3 =new Udyanavan("Sri Jayachamarajendra Botanical Garden",4,flowers3,67,2);
		park3.getFlowers3();
		
		Udyanavan park4 =new Udyanavan("Raja's Seat Garden",5,flowers4,15,6);
		park4.getFlowers4();
		
		
		
	}
}