
//// ensureCapacity() - Ensures that the StringBuilder has at least the specified capacity.
package strings.StringBuilder;
public class EnsureCapacityMethod {
	public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Before : " + sb.capacity());
        sb.ensureCapacity(50);
        System.out.println("After  : " + sb.capacity());
	}
}
