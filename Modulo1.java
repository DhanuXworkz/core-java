class Modulo1 {
	public static void main(String modulo[])
	{
		System.out.println("Main started");
		mod(34,12);
		mod(50,5);
		mod(60,34);
		mod(25,5);
		mod(60,29);
		mod(19,14);
		mod(578,34);
		mod(178,60);
		mod(122,34);
		mod(890,56);
		mod(124,80);
		mod(467,80);
		mod(90,67);
		mod(70,67);
		mod(890,56);
		mod(456,98);
		mod(78,9);
		mod(90,9);
		mod(780,78);
		mod(560,56);
		mod(56,6);
		
		mod(34,1,2);
		mod(50,5,9);
		mod(60,3,4);
		mod(25,5,8);
		mod(60,2,9);
		mod(19,1,4);
		mod(578,3,4);
		mod(178,6,0);
		mod(122,3,4);
		mod(890,5,6);
		mod(124,8,0);
		mod(467,8,0);
		mod(90,67,78);
		mod(70,6,7);
		mod(890,5,6);
		mod(456,9,8);
		mod(78,9,5);
		mod(90,9,8);
		mod(780,7,8);
		mod(560,5,6);
		mod(56,6,8);
		System.out.println("Main ended");
		
	}
	public static void mod(float a,float b)
	{
		System.out.println(a%b);
	}
	public static void mod(float a,float b,float c)
	{
		System.out.println(a%b%c);
		}
}