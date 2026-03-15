package Day2;

public class program3 {
	    public static void main(String[] args) {
	        int num = 10;
	        String binary = "";
	        
	     
	        if (num == 0) {
	            binary = "0";
	        } else {
	           
	            while (num != 0) {
	                int rem = num % 2;
	                binary = rem + binary;
	                num = num / 2;
	            }
	        }
	        
	        
	        System.out.println("The binary representation is: " + binary);
	    }
	}

