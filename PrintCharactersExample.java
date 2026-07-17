//Print each character of a String.
package strings.part1;
import java.util.Scanner;
public class PrintCharactersExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print the individual letters :");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
	}
}
