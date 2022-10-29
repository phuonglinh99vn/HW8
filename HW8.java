package HW8;

public class HW8 {
	public static void main(String[] args) {
		System.out.println(findSquareRoot(156));	
}
	public static double findSquareRoot(int x) {
		if (x == 0) {
			return x;
		}
		double left = 0;
	    double right = x;
	    double root = 0;
	    while (left <= right){
	    	double mid = (left + right)/2;
	        if (mid*mid == x) {
	         return mid;
	        }
	        if (mid*mid >= x) {
	        	right = mid - 0.01;
	    	}else {
	        	left = mid + 0.01;
	        }
	    }      	        
	    return Math.round((left - 0.01) * 100.0) / 100.0;
}
}
