
// print the MiddleCharacter of the string 
package strings.part1;
import java.util.Scanner;
public class MiddleCharacterExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int length=s.length();
		System.out.println(s.charAt(length/2));
		
	}

}
