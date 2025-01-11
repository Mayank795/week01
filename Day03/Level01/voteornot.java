import java.util.*;

public class voteornot{
 public static void main(String[] args){
  
   Scanner input = new Scanner(System.in);
  
 int[] arr = new int[10];
 
 // taking input for array
 
 for(int i=0;i<10;i++){
 System.out.println("enter age of students");
  arr[i] = input.nextInt(); 
  }
  //check student age for vote
  for(int i=0;i<10;i++){
   if(arr[i]<1){
   System.out.println("invalid age");
   }
   else if(arr[i]>=18){
   System.out.println("the student with the age "+ arr[i]+" can vote");
   }
   else{
    System.out.println("the student with the age "+ arr[i]+" can't vote");
	}
  }
	}
	}
   