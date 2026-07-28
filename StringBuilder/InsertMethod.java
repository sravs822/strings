
// insert() - Inserts the given value at the specified index position in the StringBuilder.
package strings.StringBuilder;
public class InsertMethod {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		sb.insert(0, "Core ");
		sb.insert(2, "XYZ");
		System.out.println(sb);
	}

}
