

	// StringBuffer is similar to StringBuilder.
	// The main difference is that StringBuffer is synchronized (thread-safe).
package strings.StringBuffer;
public class StringBufferDemo {
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer();
	        sb.append("Java");
	        sb.insert(0, "Core ");
	        sb.delete(0, 5);
	        sb.reverse();
	        System.out.println(sb);
	    }

	}


