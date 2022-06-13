package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager [] kredis= new BaseKrediManager[] {new TarimKrediManager(),new OgretmenKrediManager(),new OgrenciKrediManager()};
		
		for(BaseKrediManager kredi:kredis) {
			System.out.println(kredi.hesapla(2));
		}
	
	
	}

}
