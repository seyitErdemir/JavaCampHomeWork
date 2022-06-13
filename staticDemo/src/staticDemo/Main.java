package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager pm=new ProductManager();
		Product product=new Product();
		product.id=4;
		product.name="seyit";
		product.price=11;
		pm.add(product);
		
		pm.birseyCagirici(product);
	}

}
