
// delete() - Removes characters from the specified start index to end index (end index is exclusive).
package strings.StringBuilder;
public class DeleteMethod {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Java full stack");
		sb.delete(4,9);
		System.out.println(sb);
		
	}

}
