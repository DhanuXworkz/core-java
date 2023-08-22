class Factorial1{

  public static void main (String fac[]){
  
  int factNumber =6;
  int dummy =1;
  System.out.println("factNumber.length");
  for (int fact=1; fact<=factNumber; fact++)
  {
  dummy=dummy*fact;
  }
  System.out.println("the factorial of the " + factNumber + "is" + dummy);
  
  }
  }