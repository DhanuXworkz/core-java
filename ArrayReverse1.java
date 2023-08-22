class ArrayReverse1{
	
	static String fruits[]={"Mango","Apple","Orange","Kivi","Banana","Pine Apple","Papaya"};
	
	public static void main(String arr[])
	{
		
		System.out.println("fruits.length");
		for(int fruit= fruits.length-1; fruit>=0; fruit--)
		{
			System.out.println(fruits[fruit]);
		}
	
	}
}