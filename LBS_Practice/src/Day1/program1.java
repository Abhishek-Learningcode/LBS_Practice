package Day1;

public class program1 {
	    public static void main(String[] args) {
	        boolean isPrime = true;
	        int num = 4;
	        
	        
	        if (num <= 1) {
	            isPrime = false;
	        } else {
	          
	            for (int i = 2; i < num; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }
	        
	      
	        if (isPrime) {
	            System.out.println("number is prime");
	        } else {
	            System.out.println("not");
	        }
	    }
	}

