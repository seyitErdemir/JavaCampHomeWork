package oopIntro;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		Product product1=new Product(1,"lenova",15000,"15gbram",4);
		
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("lenovo");
		product2.setUnitPrice(1000);
		product2.setDetail("32 gb ram");
		product2.setDiscount(4);
		
		
		
		
		Product[] products={ product1,product2};
			
		for(Product product : products) {
			System.out.println(product.getName());
		}
		System.out.println(products.length);
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("pc");
		
		Category category2=new Category();
		category2.setId(2);
		category2.setName("ev bahce");	
		System.out.println(category1.getId());
		System.out.println(category2.getName());
		
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
	}

}
