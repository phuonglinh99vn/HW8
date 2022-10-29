package HW8;

public class Roman {
	public static void roman(String[] args) {
		int result = romanToInt("LVIII");	
		System.out.println(result);
	}
	public static int romanToInt(String s) {    
		int convert = 0;
        int previous = 0;
        int current = 0; 
        for (int i = s.length(); i >= 0; i--) {
        	switch(s.charAt(i)){
            	case 'I':
            		current = 1;
            		break;
            	case 'V':
            		current = 5;
            		break;
            	case 'X':
            		current = 10;
            		break;
            	case 'L':
            		current = 50;
            		break;
            	case 'C':
            		current = 100;
            		break;
            	case 'D':
            		current = 500;
            		break;
            	case 'M':
            		current = 1000;
            		break;
        	}
        	if ( previous > current) {
        		convert -= current;
            }else{
            	convert += current;
                previous = current;
            }
    
        }
		return convert;
      
	}
}
