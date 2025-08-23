package InterviewCoding;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		//1. Reverse using for loop
		int len = str.length();
		
		String revStr = "";
		
		for(int i=len-1; i >= 0; i--) {
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println(revStr);
		
		//2. Reverse using string buffer class
		StringBuffer strBuffer = new StringBuffer(str);
		
		System.out.println(strBuffer.reverse());

	}

}
