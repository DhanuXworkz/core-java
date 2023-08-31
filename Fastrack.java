class Fastrack {
    int itemId;
    String itemType;
    String model;
    String color;
    double price;
    boolean isAvailable;
	
	public Fastrack(int idd,String type,String mod,String colr,double cost,boolean need){
		itemId=idd;
		itemType=type;
		model=mod;
		color=colr;
		price=cost;
		isAvailable=need;
		
		System.out.println("Item ID: " + itemId);
        System.out.println("Item Type: " + itemType);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " +isAvailable);
		
	}

    public void displayWatchDetails() {
        System.out.println("Details of the Watch");
    }

}