
// replace() - Replaces the characters from the specified start index to end index with the given string.
package strings.StringBuilder;
public class ReplaceMethod {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("It is a replace method");
		sb.replace(6, 7, "StringBuilder");
		System.out.println(sb);
	}
}
