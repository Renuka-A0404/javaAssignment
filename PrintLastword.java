package JavaChallenge;

public class PrintLastword {

	public static void main(String[] args) {
		
		String str = "HELLO WORLD ";
	    String strlen = str.substring(6,11);
	    System.out.println("Print The Last Word is "  + strlen + " with length " +strlen.length());
	    
	    
	    String str1= "FLY ME TO THE MOON ";
	    String str1len = str1.substring(14,18);
	    System.out.println("Print The Last Word is "  + str1len + " with length " +str1len.length());
	    
	    
	    String str2= "LUFFY IS STILL JOYBOY ";
	    String str2len = str2.substring(15,21);
	    System.out.println("Print The Last Word is " + str2len + " with length " +str2len.length());   
	}
}
