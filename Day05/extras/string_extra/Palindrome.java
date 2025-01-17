import java.util.Scanner;

public class Palindrome {

        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            String text = in.next();
            StringBuilder reverse_text= new StringBuilder();
            for(int i=text.length()-1;i>=0;i--){
                reverse_text.append(text.charAt(i));
            }
            String text2= reverse_text.toString();
            if(text == text2){
                System.out.println("It is palindrome");
            }
            else{
                System.out.println("it is not palindrome");
            }
        }
    }

