import java.util.*;

public class String_reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String text = in.next();
        StringBuilder reverse_text= new StringBuilder();
        for(int i=text.length()-1;i>=0;i--){
           reverse_text.append(text.charAt(i));
        }
        System.out.println(reverse_text);
    }
}
