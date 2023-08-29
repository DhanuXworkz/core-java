class FastrackExecutor {
    public static void main(String items[]) {
        Fastrack watch1 = new Fastrack();
        watch1.itemId = 584;
        watch1.itemType = "Watch";
        watch1.model = "Sporty Chronograph";
        watch1.color = "Black";
        watch1.price = 89.99;
        watch1.isAvailable = true;
        System.out.println("Item ID: " + watch1.itemId);
        System.out.println("Item Type: " + watch1.itemType);
        System.out.println("Model: " + watch1.model);
        System.out.println("Color: " + watch1.color);
        System.out.println("Price: $" + watch1.price);
        System.out.println("Availability: " + watch1.isAvailable);
        watch1.displayWatchDetails();
        System.out.println("\n");

        Fastrack sunglass1 = new Fastrack();
        sunglass1.itemId = 201;
        sunglass1.itemType = "Sunglasses";
        sunglass1.model = "Aviator Classic";
        sunglass1.color = "Gold";
        sunglass1.price = 59.50;
        sunglass1.isAvailable = true;
        System.out.println("Item ID: " + sunglass1.itemId);
        System.out.println("Item Type: " + sunglass1.itemType);
        System.out.println("Model: " + sunglass1.model);
        System.out.println("Color: " + sunglass1.color);
        System.out.println("Price: $" + sunglass1.price);
        System.out.println("Availability: " + sunglass1.isAvailable);
        sunglass1.displayWatchDetails();
        System.out.println("\n");

        Fastrack watch2 = new Fastrack();
        watch2.itemId = 154;
        watch2.itemType = "Watch";
        watch2.model = "Digital Sports";
        watch2.color = "Blue";
        watch2.price = 34.99;
        watch2.isAvailable = false;
        System.out.println("Item ID: " + watch2.itemId);
        System.out.println("Item Type: " + watch2.itemType);
        System.out.println("Model: " + watch2.model);
        System.out.println("Color: " + watch2.color);
        System.out.println("Price: $" + watch2.price);
        System.out.println("Availability: " + watch2.isAvailable);
        watch2.displayWatchDetails();
        System.out.println("\n");

        Fastrack sunglass2 = new Fastrack();
        sunglass2.itemId = 202;
        sunglass2.itemType = "Sunglasses";
        sunglass2.model = "Square Retro";
        sunglass2.color = "Black";
        sunglass2.price = 45.75;
        sunglass2.isAvailable = true;
        System.out.println("Item ID: " + sunglass2.itemId);
        System.out.println("Item Type: " + sunglass2.itemType);
        System.out.println("Model: " + sunglass2.model);
        System.out.println("Color: " + sunglass2.color);
        System.out.println("Price: $" + sunglass2.price);
        System.out.println("Availability: " + sunglass2.isAvailable);
        sunglass2.displayWatchDetails();
        System.out.println("\n");

        Fastrack watch3 = new Fastrack();
        watch3.itemId = 103;
        watch3.itemType = "Watch";
        watch3.model = "Slim Dress Watch";
        watch3.color = "Silver";
        watch3.price = 109.00;
        watch3.isAvailable = true;
        System.out.println("Item ID: " + watch3.itemId);
        System.out.println("Item Type: " + watch3.itemType);
        System.out.println("Model: " + watch3.model);
        System.out.println("Color: " + watch3.color);
        System.out.println("Price: $" + watch3.price);
        System.out.println("Availability: " + watch3.isAvailable);
        watch3.displayWatchDetails();
    }

}