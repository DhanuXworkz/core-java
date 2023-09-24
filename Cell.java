class Cell{
	
	private String name;
	private int price;
	private String composition;
	private  String capacity;
	private String madeCountry;
	
	public void setName(String name){
		this.name=name;
		
	}
	public String getName(){
		return name;
	}
	
	public void setPrice(int price){
		this.price=price;
		
	}
	public int getPrice(){
		return price;
	}
	
	public void setComposition(String composition){
		this.composition=composition;
		
	}
	public String getComposition(){
		return composition;
	}
	public void setCapacity(String capacity){
		this.capacity=capacity;
		
	}
	public String getCapacity(){
		return capacity;
	}
	public void setMadeCountry(String madeCountry){
		this.madeCountry=madeCountry;
		
	}
	public String getMadeCountry(){
		return madeCountry;
	}
}