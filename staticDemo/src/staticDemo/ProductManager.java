package staticDemo;

public class ProductManager {
	public void add(Product product) {
		ProductValidator validater=new ProductValidator();
		if(validater.isValidator(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("�r�n bilgileri ge�ersizdir");
		}
	}
	
	public void birseyCagirici(Product product) {
		//bisey metodu statik oldugu i�in  newlemeden gelir
		ProductValidator.bisey(product);
		
	}
}
