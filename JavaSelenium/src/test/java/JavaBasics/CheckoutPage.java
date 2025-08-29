package JavaBasics;

public class CheckoutPage extends AddProductsPage{

	public void AddProductsCheckOut(String Product) {
		
		if(Product == "Adidas") {
			System.out.println("CheckoutPage - I'm able to add the Adidas products from CheckoutPage class due to same method name");
		}
		
		else if(Product == "Puma") {
			System.out.println("CheckoutPage - I'm able to add the Puma products from CheckoutPage class due to same method name");
		}
	}
	
	public void CheckoutAndMakePayment() {
		System.out.println("CheckoutPage - I'm able to checkout and complete the payment");
	}

}
