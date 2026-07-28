
// deleteCharAt() - Removes the character at the specified index.
package strings.StringBuilder;
public class DeleteCharAtMethod {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Hello welcome Guys");
		sb.deleteCharAt(2);
		sb.deleteCharAt(10);
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder("ABCDE");
		sb1.deleteCharAt(1);
		System.out.println(sb1);
	}
}
