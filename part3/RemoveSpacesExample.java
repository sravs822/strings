// remove spaces in the given string
package strings.part3;
import java.util.Scanner;
public class RemoveSpacesExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split("\\s+");
		for(int i=0;i<s1.length;i++) {
			System.out.print(s1[i]+" ");
			
		}
		
		
	}

}
