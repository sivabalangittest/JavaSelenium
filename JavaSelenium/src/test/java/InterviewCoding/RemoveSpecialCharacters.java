package InterviewCoding;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		//Using regular expression and replaceAll method 
		
		String str = "*&^*&%&^&^$&^Test* (^*&%&^$&$&$^Selenium";
		
		System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));
		

	}

}
