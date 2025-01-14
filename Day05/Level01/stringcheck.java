import java.util.*;
public class stringcheck{
     
	 
	 
		 public static void main(String[] args){
			 Scanner input = new Scanner(System.in);
			 
			 System.out.println("enter a string");
			 String str1 = input.next();
			 
			 System.out.println("enter a string");
			 String str2 = input.next();
			 
			 boolean result = compareStrings(str1,str2);
			 
			 boolean equalresult = str1.equals(str2);
			 
			 System.out.println("Comparison using charAt() method "+ result);
			 System.out.println("Comparison using equals() method "+ equalresult);
			 
		 }
		 
		 public static boolean compareStrings( String str1, String str2){
	      
		  if(str1.length()!= str2.length()){
		  return false;
		  }
		  for(int i=0;i<str1.length();i++){
		  if(str1.charAt(i) != str2.charAt(i)){
			  return false;
		  }
		}
		 
			  return true;
	 }
	 }
			
			 