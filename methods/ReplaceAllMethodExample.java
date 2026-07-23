
// replaceAll() -method
package strings.methods;
public class ReplaceAllMethodExample {
	public static void main(String[] args) {
		String s="Education";
		String v="abc123xyz";
		String b="java      programming       Language";
		System.out.println(s.replaceAll("[aeiou]", "*"));
		System.out.println(v.replaceAll("\\d", "#"));
		System.out.println(b.replaceAll("\\s+"," "));
	}

}
