
// . Reverse the Order of Words
package strings.part3;
import java.util.Scanner;
public class ReverseWordOrderExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String [] word=s.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.print(word[i]+" ");
		}
	}
}
