
// Count Vowels, Consonants, Digits and Spaces in One Program

// Example
// Input:
// Java 123

//Output:
//Vowels      : 2
//Consonants  : 2
//Digits      : 3
//Spaces      : 1
package strings.part2;
import java.util.Scanner;
public class CharacterStatisticsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ||
                (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                vowels++;
            } 
            else if ((ch >= 'a' && ch <= 'z') ||
                     (ch >= 'A' && ch <= 'Z')) {
                consonants++;
            } 
            else if (ch >= '0' && ch <= '9') {
                digits++;
            } 
            else if (ch == ' ') {
                spaces++;
           }
        }
        System.out.println("Vowels      : " + vowels);
        System.out.println("Consonants  : " + consonants);
        System.out.println("Digits      : " + digits);
        System.out.println("Spaces      : " + spaces);

    }
}