package JavaBasics;

public class MethodOverridingPolymorphism {

	public static void main(String[] args) {
		// Method Overriding - Same method name with same number of arguments available in parent and child class - method from the child class will be used
		
		// Compile or Static Polymorphism (Method Overloading) - method id decided based on the number of arguments during compilation
		
		// Runtime or Dynamic Polymorphism (Method Overriding) - method is decided during the runtime based on parent-child relationship
		// - child class object referenced by parent class reference variable --> Top Casting
		// - only parent methods and overridden methods can be called (parent cannot inherit from child)
		
		
		CheckoutPage AddPumaProductAndCheckout = new CheckoutPage();
		
		AddPumaProductAndCheckout.LoginWebsiteUsingCredentials();
		AddPumaProductAndCheckout.CompleteRegistrationForm();
		AddPumaProductAndCheckout.AddProductsCheckOut("Puma");
		AddPumaProductAndCheckout.AddProducts("Adidas","Nike");
		AddPumaProductAndCheckout.CheckoutAndMakePayment();
		
		System.out.println("*************");
		AddProductsPage AddPumaProduct = new CheckoutPage();
		
		AddPumaProduct.LoginWebsiteUsingCredentials();
		AddPumaProduct.CompleteRegistrationForm();
		AddPumaProduct.AddProductsCheckOut("Puma");
		
	}

}

