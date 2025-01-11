import java.util.*;

public class table6_9{
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  System.out.println("enter a number");
  int num = input.nextInt();
  int[] arr= new int[4];
  //array storing table
  for(int i=0;i<4;i++){
  arr[i] = (num*(i+6));
  }
  // showing the result
  for(int i=0;i<4;i++){
  System.out.println(num + "*" + (i+6) + "=" + arr[i]);
  }
  }
  }