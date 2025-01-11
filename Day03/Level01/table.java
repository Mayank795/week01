import java.util.*;

public class table{
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  System.out.println("enter a number");
  int num = input.nextInt();
  int[] arr= new int[11];
  // array input
  
  for(int i=1;i<=10;i++){
  arr[i] = (num*i);
  }
  // showing result
  
  for(int i=1;i<=10;i++){
  System.out.println(num + "*" + i + "=" + arr[i]);
  }
  }
  }