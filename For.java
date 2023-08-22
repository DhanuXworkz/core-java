class For {
	
	static String name[] ={"Dhanu", "Chandu","Adi","Gagan","Vasu","Hruthik","Abhi","Kantha"};
	
	public static void main(String v[])
	{
		System.out.println("name.length");
		for ( int nam= name.length-1; nam>=0; nam--)
		{
			System.out.println(name[nam]);
		}
}
}