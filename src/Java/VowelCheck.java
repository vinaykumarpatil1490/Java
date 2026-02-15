package Java;
import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        Scanner vowel = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = vowel.next().toLowerCase().charAt(0); // read first character, make lowercase

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("It is a vowel.");
        } else if (Character.isLetter(ch)) {
            System.out.println("It is a consonant.");
        } else System.out.println("Not a letter.");

        vowel.close();
    }
}

