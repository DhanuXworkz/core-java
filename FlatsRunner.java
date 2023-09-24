class FlatsRunner{
	public static void main(String[] mana){


	Flats flats=new Flats();
	flats.setFlatId("a2");
	flats.setNoOfDoors(5);
	flats.setNoOfWindoors(10);

	Apartments	apartments=new Apartments();
	apartments.flats=flats;

	apartments.apartmentName="Shobha Luxury Apartments";

		System.out.println("Apartment Name : "+apartments.apartmentName);
		System.out.println("Flat Id : "+apartments.flats.getFlatId());
		System.out.println("No of Doors : "+apartments.flats.getNoOfDoors());
		System.out.println("No of Windoors : "+apartments.flats.getNoOfWindoors());

	}
}