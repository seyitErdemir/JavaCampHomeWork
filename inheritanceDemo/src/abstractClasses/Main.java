package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator x=new WomanGameCalculator();
		x.hesapla();
		x.gameOver();
		
		
		
		
		//abstract claslar bu �ekilde kullan�l�r
		GameCalculator c =new GameCalculator() {
			public void hesapla() {
			}
		};
		c.gameOver();
		
		
		//sonras�nda a�t�g�n bi s�n�fada eri�im saglan�r
		GameCalculator yasl�=new  OlderGameCalculator();
		yasl�.hesapla();
		yasl�.gameOver();
		
		
	}

}
