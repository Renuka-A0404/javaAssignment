  package JavaChallenge;

  import java.util.Scanner;

        public class SquareRoot { 
	    public static void main(String[] args) {
	    double num;
	    
	    	Scanner sc = new Scanner (System.in);
	    	System.out.println("Enter a number");
	    	num = sc.nextDouble();
	    	System.out.println("Square root of is "+ num +" is ");
	    	System.out.println(Math.sqrt(num));
	    	
	    }
	}