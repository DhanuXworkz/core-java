class KitchenExecutor{

public static void main(String  args[]){
	
	
	Kitchen kitchen = new Kitchen();
	kitchen.setName("Super Kitchen");
	kitchen.setLocation("Vijayanagr");
	kitchen.setOwner("Dhanu");
	
	
	  Hotela kelasa = new Hotela();
	  kelasa.kichen = kitchen;
	  kelasa.hotelName=("Krishna");
	  
	  System.out.println(kelasa.kichen.getName());
	  System.out.println(kelasa.kichen.getLocation());
	  System.out.println(kelasa.kichen.getOwner());
	  
	  System.out.println(kelasa.hotelName);
	
}


}