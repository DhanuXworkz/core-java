class CellRunner {
	public static void main (String args[]){
		Cell battery =new Cell();
		battery.setName("litium ion coin battery");
		battery.setPrice(30);
		battery.setComposition("Mercury,manganese dioxide");
		battery.setCapacity("200 mAh");
		battery.setMadeCountry("Bharath");
		
		
		Watch rolex =new Watch();
		
		//has-A relation
		rolex.cell=battery;
		rolex.companyName=("Renata");
		
		
		
		System.out.println("Battery Type:"+rolex.cell.getName());
		System.out.println("Price:"+rolex.cell.getPrice());
		System.out.println("Battery consists:"+rolex.cell.getComposition());
		System.out.println("Battery Capacity:"+rolex.cell.getCapacity());
		System.out.println("Battery Made In:"+rolex.cell.getMadeCountry());
		System.out.println("Company Name:"+rolex.companyName);
		
		
	}
}