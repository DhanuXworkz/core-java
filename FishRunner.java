class FishRunner {
	
	
	public static void main (String args[]){
		
		Fish fish =new Fish();
		fish.setName("Bangade");
		fish.setKg(1);
		fish.setPrice(200);
		//has a
		Water water =new Water();
		water.bangade=fish;
		water.riverName=("Sharavathi");
		
		
		
		System.out.println("fish Name "+fish.getName());
		System.out.println("Fish KG "+fish.getKg());
		System.out.println("Fish Price "+fish.getPrice());
		System.out.println(water.riverName);
	}
}