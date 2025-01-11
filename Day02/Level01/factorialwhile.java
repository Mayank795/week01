import java.util.*;

public class factorialwhile{
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
	   System.out.println("enter a number " );
	  int num = input.nextInt();
	  
	  // Getting factorial
	  int fac =1;
	  while(num > 0){
	  fac*=num;
	  num--;
	  }
	  System.out.println("the factorial is " + fac);
	  }
	  }