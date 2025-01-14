import java.util.*;

public class substring{
  public static String createsubstring(String str1,int start,int end){
	  
	  StringBuilder substring = new StringBuilder();
	  
	  for(int i=start;i<end;i++){
		  substring.append(str1.charAt(i));
	  }
	  return substring.toString();
  }
  
  public static boolean compareStrings(String str1,String str2){
	  if(str1.length() != str2.length()){
		  return false;
	  }
	  for(int i=0;i<str1.length();i++){
	  if(str1.charAt(i) != str2.charAt(i)){
		  return false;
	  }
	 }
	 return true;
  }
  
   public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("enter a string");
	   String str1= input.next();
	   
	   System.out.println("enter a starting index");
	   int start= input.nextInt();
	   
	    System.out.println("enter a ending index");
	   int end= input.nextInt();
	   
	   String customSubstring = createsubstring(str1,start,end);
	   
	   String builtinSubstring = str1.substring(start, end);
	   
	   boolean areEqual = compareStrings( customSubstring,builtinSubstring);
	   
	   System.out.println("Substring using charAt(): " + customSubstring);
        System.out.println("Substring using built-in method: " + builtinSubstring);
        System.out.println("Are the substrings equal? " + areEqual);
   }
}