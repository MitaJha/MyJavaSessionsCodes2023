package builderPattern;

public class ShopTest {

	public static void main(String[] args) {
		Shopping shop = new Shopping();
		shop.login("mita.jha@gmail.com", "  mita123")
			.search("iphone14")
				.addToCart("iphone14")
					.doPayment("3232 3243 5455 4354", 456)
						.generateOrder()
							.logout();
			
		System.out.println("-----------");
		
		shop.login("mita.jha@gmail.com", " mita123")
		.search("bag", 1000)
			.addToCart("bag")
				.logout();
		System.out.println("-----------");

		shop.login("mita.jha@gmail.com", " mita123")
			.search("dress")
				.search("cups",10)
					.search("books").addToCart("dress")
						.generateOrder()
							.doPayment("3232 3243 5455 4354", 456)	
								.logout();
		System.out.println("-----------");

		shop.login("mita.jha@gmail.com", " mita123")
		.logout();

	}

}
