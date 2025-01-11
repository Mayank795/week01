import java.util.*;

public class checknumber{
 public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);
  
  int[] arr = new int[5];
  //taking array
  for(int i=0;i<5;i++){
   
   System.out.println("enter a number");
   arr[i]= input.nextInt();
   }
   //condition and solution
   for(int i=0;i<5;i++){
   
   if(arr[i]<0){
	  System.out.println("the number is negative"); 
   }
   else if(arr[i]==0){
	   System.out.println("the number is Zero");
   }
   else if(arr[i]>0){
	   if(arr[i]%2==0){
		   System.out.println(arr[i]+"is an even number");
	   }
	   else{
		   System.out.println(arr[i]+"is an odd number");
	   }
   }
   }
   if(arr[0]==arr[4]){
	   System.out.println("the first and last numbers are equal");
   }
   else if(arr[0]>arr[4]){
	   System.out.println("the first number is greater then the last number");
   }
   else{
	   System.out.println("the first number is less then the last number");
   }
 }
}