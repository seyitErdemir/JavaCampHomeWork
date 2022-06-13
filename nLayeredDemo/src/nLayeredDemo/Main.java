package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductMenager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
			
		//bir projede entitiy ler harici  new lenmemesi lazým
		ProductService productService =new ProductMenager(new AbcProductDao(),new JLoggerManagerAdapter());

		Product product=new Product(1,2,"elma",12,44);
		productService.add(product);
	}

}
