class Method {

public static void main (String method[])
{
	System.out.println("Main started");
getFact(5);
getFact(7);
getFact(9);
System.out.println("main Ended");
}

public static void getFact(int factNumber){
	System.out.println("getFact Started");
	int fact =1;
	for(int n=1;n<=factNumber;n++)
	{
		fact =fact*n;
	}
	System.out.println("The Factorial of " + factNumber + "is "+ fact);
 System.out.println("getFact ended");
 }
}