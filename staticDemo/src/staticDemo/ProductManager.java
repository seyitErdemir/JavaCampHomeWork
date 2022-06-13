package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validater=new ProductValidator();
		if(validater.isValidator(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("ürün bilgileri geçersizdir");
		}
	}
	
	public void birseyCagirici(Product product) {
		//bisey metodu statik oldugu için  newlemeden gelir
		ProductValidator.bisey(product);
		
	}
}
