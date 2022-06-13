package staticDemo;

public  class ProductValidator {
	public  boolean isValidator(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		}
	
	public static void bisey(Product product) {
		System.out.println( "ismi :" + product.name);
	}
}
