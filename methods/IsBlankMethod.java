
// isBlank() - Checks whether the string is empty or contains only whitespace characters.
package strings.methods;
public class IsBlankMethod {
	public static void main(String[] args) {
		String s = "     ";
		System.out.println(s.isBlank());
        System.out.println("".isBlank());
        System.out.println("     ".isBlank());
        System.out.println("Java".isBlank());
        System.out.println("  Java  ".isBlank());
	}

}
