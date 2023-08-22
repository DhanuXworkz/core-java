class Multiplication1{
	
	public static void main(String mul[]){
		System.out.println("Main Started");
		// invoke the method, 143 is the arguments
		mul(143,87);
		mul(89,76);
		mul(34,87);
		mul(34,90);
		mul(78,56);
		mul(45,89);
		mul(56,87);
		mul(65,78);
		mul(4,8);
		mul(12,67);
		mul(45,87);
		mul(12,21);
		mul(76,90);
		mul(40,80);
		mul(70,90);
		mul(67,90);
		mul(45,87);
		mul(43,70);
		mul(56,80);
		mul(12,80);
		mul(80,45);
		
		mul(143,87,9);
		mul(89,7,6);
		mul(34,8,7);
		mul(34,9,0);
		mul(78,5,6);
		mul(45,8,9);
		mul(56,8,7);
		mul(65,7,8);
		mul(4,8,9);
		mul(12,6,7);
		mul(45,8,7);
		mul(12,2,1);
		mul(76,9,0);
		mul(40,8,0);
		mul(70,9,0);
		mul(67,9,0);
		mul(45,87,3);
		mul(43,7,0);
		mul(56,8,0);
		mul(12,8,0);
		mul(80,4,5);
		
		System.out.println("Main ended");
	}
	public static void mul(int a, int b)
	{
	System.out.println(a*b);
	}
	
	public static void mul(int a, int b,int c)
	{
	System.out.println(a*b*c);
	}
	
	
	
	
	
	
	
}