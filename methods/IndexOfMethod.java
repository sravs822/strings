
// indexOf method
package strings.methods;
import java.util.Scanner;
public class IndexOfMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.indexOf('a'));
		System.out.println(s.indexOf('v'));// if element not present in the string it returns -1 
		System.out.println(s.indexOf('@'));
	}

}
