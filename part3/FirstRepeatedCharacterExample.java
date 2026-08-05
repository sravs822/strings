
// Print the first character that repeats in the string.
package strings.part3;
import java.util.Scanner;
public class FirstRepeatedCharacterExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s=sc.nextLine();
		boolean found = false;
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
					found=true;
					break;
				}
			}
			if(found) {
				break;
			}
		
	}

}}
