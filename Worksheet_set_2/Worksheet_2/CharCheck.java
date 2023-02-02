import java.util.*;
public class CharCheck {
    public static void vowelORconsonant(char character ) {

        if (character=='a'|| character=='e' || character =='i' || character=='o' || character=='u') {
             System.out.println(character + " is a vowel.");
            
        } else {
            System.out.println(character + " is a consonant.");
             }
        
    }
    public static void main(String[] args) {
       vowelORconsonant('j');
    }
    
}
