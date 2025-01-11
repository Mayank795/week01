import java.util.*;

public class factorialfor{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
	   System.out.println("enter a number " );
	  int num = input.nextInt();
	  
	  // Getting factorial
	  int fac =1;
	  for(int i=num;i>0;i--){
	   fac*=i;
	  }
	  System.out.println("the factorial is " + fac);
	  }
	  }