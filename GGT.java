/**
 * 
 */

/**
 * @author khale
 *
 */
public class GGT {

	/**
	 * @param args
	 */

	public static void main(String s[]) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int r;
		int m = a;
		int n = b;
		
		if (m < 0 || n < 0) {
			System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
			System.exit(-1);
	}
		do {
			if (m < n)		{
			int t = m;
			m = n;
			n = t;
		}
	    	r = m - n;
	    	m = n;
	    	n = r;
		}
		while (r != 0);
				
	    System.out.println("ggT(" + a + "," + b + ")=" + m);         
	}
}
