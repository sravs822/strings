
//Print each character in reverse order. 
package strings.part1;
import java.util.Scanner;
public class ReverseCharacterPrintExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print the individual characters in reverse:");
		String s=sc.nextLine();
		for(int i= s.length() - 1;i >= 0;i--) {
			System.out.println(s.charAt(i));
			
		}
		
	}

}
