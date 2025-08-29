package JavaBasics;

public class InheritanceConcept {
	
	// Inheritance - Able to use the variables/methods of parent/super class in the child/sub class
	

	public static void main(String[] args) {
		
		CheckoutPage AddAdidasProductAndCheckout = new CheckoutPage();
		
		AddAdidasProductAndCheckout.LoginWebsiteUsingCredentials();
		AddAdidasProductAndCheckout.CompleteRegistrationForm();
		AddAdidasProductAndCheckout.AddProducts("Adidas");
		AddAdidasProductAndCheckout.CheckoutAndMakePayment();

	}

}
