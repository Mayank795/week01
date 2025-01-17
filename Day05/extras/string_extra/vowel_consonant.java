import java.util.*;
public class vowel_consonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        int vowel=0;
        int consonant=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='a' || text.charAt(i)=='i' ||text.charAt(i)=='u' ||text.charAt(i)=='o' ||text.charAt(i)=='e' ){
              vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonant);
    }
}
