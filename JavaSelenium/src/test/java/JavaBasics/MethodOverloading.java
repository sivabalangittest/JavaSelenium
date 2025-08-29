package JavaBasics;

public class MethodOverloading {
	
	// Method Overloading - Duplicate Methods - Usage of same method name with different parameter count
	// Same parameter count can be used but with different data type
	// Main method overloading is possible - with different data type parameter

	public static void main(String[] args) {
		
		MethodOverloading methodload = new MethodOverloading();
		
		methodload.sum();
		methodload.sum(10);
		methodload.sum(10.2);
		methodload.sum(10,20);
		methodload.main(10);


	}
	
	public void main(int j) {
		System.out.println("Output from main method overloading");
		
	}
	
	public void sum() {
		System.out.println("Sum Method - with no parameter");
	}
	
	public void sum(int i) {
		System.out.println("Sum Method - with one parameter int");
		
	}
	
	public void sum(double d) {
		System.out.println("Sum Method - with one parameter double");
	}
	
	public void sum(int k, int l) {
		System.out.println("Sum Method - with two parameters");
	}
}
