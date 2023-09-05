package JavaChallenge;

public class PalindromeCheck  {
	public static void main (String[] args) throws InterruptedException {
		String s1=" A man a plan a canal Panama";
		String s2="";
		String replaceAll = s1.replaceAll("[^a-zA-Z0-9]", "");
		String lowerCase = replaceAll.toLowerCase();
		
		char[] charArray = lowerCase.toCharArray();
		for (int i=charArray.length-1;i>=0; i++) {
			s2 = s2+charArray[i];
		}
				if(s2.equals(lowerCase))  {
					System.out.println("is Palindrome");
					
				}
				else {
					System.out.println("not Palindrome");
				}
	}
}
