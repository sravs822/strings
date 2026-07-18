

// Count the total number of consonants in a String.
package strings.part2;
import java.util.Scanner;
public class CountConsonantsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    &&
                (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'
                 && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')) {
                count++;
            }
        }

        System.out.println("Consonants = " + count);
    }
}