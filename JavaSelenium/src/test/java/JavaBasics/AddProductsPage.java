package JavaBasics;

public class AddProductsPage extends RegistrationPage{

	
	public void AddProducts(String Product) {
		
		if(Product == "Adidas") {
			System.out.println("AddProductsPage - I'm able to add the Adidas products");
		}
		
		else if(Product == "Puma") {
			System.out.println("AddProductsPage - I'm able to add the Puma products");
		}
	}
	
	// Method Overriding - Same Method name used in AddProductsPage and CheckoutPage class
	public void AddProductsCheckOut(String Product) {
		
		if(Product == "Adidas") {
			System.out.println("AddProductsPage - I'm able to add the Adidas products");
		}
		
		else if(Product == "Puma") {
			System.out.println("AddProductsPage - I'm able to add the Puma products");
		}
	}
	
	
	// Method Overloading - Same Method within the class with different number of parameters
	public void AddProducts(String FirstProduct, String SecondProduct) {
		
		if(FirstProduct == "Adidas" & SecondProduct == "Puma") {
			System.out.println("AddProductsPage - I'm able to add the Adidas and Puma products");
		}
		
		else if(FirstProduct == "Adidas" & SecondProduct == "Nike") {
			System.out.println("AddProductsPage - I'm able to add the Adidas and Nike products");
		}
	}

}
