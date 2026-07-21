
// Print the first character that appears exactly once in the string.
package strings.part3;

import java.util.Scanner;

public class FirstNonRepeatedCharacterExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Print the first non-repeated character:");

        String s = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeated Character : " + s.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No Non-Repeated Character");
        }
    }
}