package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
	
		
	  KrediUI k= new KrediUI();
	  k.KrediHesapla(new OgretmenKrediManager());
	  k.KrediHesapla( new AskerKrediManeger());
	   
	  
	}

}
