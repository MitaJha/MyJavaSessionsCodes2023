package builderPattern;

public class Shopping {

	public Shopping login()	{		
		System.out.println("user is logged in");
		return this;
	}
	public Shopping login(String name, String password) {
			System.out.println("log in with " + name + password);
			return this;
		}
	public Shopping search(String productname) {
		System.out.println("search with " + productname );
		return this;
	}
	public Shopping search(String productname, int price) {
		System.out.println("search with " + productname + price );
		return this;
	}
	public Shopping addToCart(String productName) {
		System.out.println("add to cart : " + productName);
		return this;
	}

	public Shopping doPayment(String cc, int cvv) {
		System.out.println("make payment: " + cc + " : " + cvv);
		return this;
	}

	public Shopping doPayment(String upi) {
		System.out.println("make payment: " + upi);
		return this;
	}

	public Shopping generateOrder() {
		System.out.println("generating order, order id is : " + 12345);
		return this;
	}

	public Shopping logout() {
		System.out.println("logout");
		return this;
	}
	
	
	
	
	
	
	}
	
	
	

