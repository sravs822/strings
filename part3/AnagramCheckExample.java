
// Two strings are called anagrams if they contain the
// same characters with the same frequency, but the order can be different.
package strings.part3;
import java.util.Scanner;
public class AnagramCheckExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String p=sc.next();
		if(s.length()>p.length() && p.length()>s.length()) {
			boolean no= false;
		}
		if(s.contains(p)) {
			System.out.println("Anagaram");
		}
	}

}
