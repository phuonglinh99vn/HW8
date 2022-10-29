package HW8;

public class Longstring {
	public static void main(String[] args) {
		String[] strs = new String[] {"flower", "flow", "flight", "flew"};
		String result = solution(strs);	
		System.out.println(result);
	}
	
	public static String solution(String[] strs) {	
		if (strs.length == 0) return "Empty String";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++ ) { 
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() -1);
			}
		}
		return prefix;
	}
}
