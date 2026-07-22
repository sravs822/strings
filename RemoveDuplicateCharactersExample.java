
// Remove Duplicate Characters from a String
package strings.part3;
import java.util.Scanner;
public class RemoveDuplicateCharactersExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
