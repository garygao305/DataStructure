/*
 * @author Gary Gao
 * using Java collection Set to de-duplicate arrays and lists
 */

import java.util.*;

public class Distinct {
	public static boolean dis(int[] a) {
		
		HashSet<Integer> aa = new HashSet<Integer>();
		
		for(int c: a) {
			aa.add(c);
		}
		
		return (a.length == aa.size());
		
		
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,3,5};
		
		System.out.print(dis(a));
	}
}
