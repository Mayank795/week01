import java.util.*;
public class arraysum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double sum= 0;
double[] arr= new double[10];
 int j=0;
 // array input
while(j<10){
	System.out.println("enter a number");
    arr[j]= input.nextDouble();
	j++;
	}
	// calculation
for(int i=0;i<10;i++){
    if(arr[i]>0){
	sum+=arr[i];
	System.out.println("the number is " + arr[i]);
	}
	}
	System.out.println("the sum is " + sum);
	}
	}
	