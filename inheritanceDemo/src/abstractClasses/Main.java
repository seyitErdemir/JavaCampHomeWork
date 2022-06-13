package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator x=new WomanGameCalculator();
		x.hesapla();
		x.gameOver();
		
		
		
		
		//abstract claslar bu þekilde kullanýlýr
		GameCalculator c =new GameCalculator() {
			public void hesapla() {
			}
		};
		c.gameOver();
		
		
		//sonrasýnda açtýgýn bi sýnýfada eriþim saglanýr
		GameCalculator yaslý=new  OlderGameCalculator();
		yaslý.hesapla();
		yaslý.gameOver();
		
		
	}

}
