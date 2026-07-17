// print the last character of the string
package strings.part1;
import java.util.Scanner;
public class LastCharacterExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int lastIndex = s.length() - 1;
		System.out.println(s.charAt(lastIndex));
	}

}
