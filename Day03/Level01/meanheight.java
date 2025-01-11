import java.util.*;
public class meanheight{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double sum= 0;
double[] arr= new double[11];
 int j=0;
 
 // taking input for array
while(j<11){
	System.out.println("enter a number");
    arr[j]= input.nextDouble();
	j++;
	}
 // sum of all elements
for(int i=0;i<11;i++){
    if(arr[i]>0){
	sum+=arr[i];
	
	}
	}
	
	sum/=11;// getting mean height
	System.out.println("the mean height of the football team is " + sum);
	}
	}