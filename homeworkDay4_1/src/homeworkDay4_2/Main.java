package homeworkDay4_2;

import java.util.Date;

import homeworkDay4_2.concrete.GameManager;
import homeworkDay4_2.concrete.GameSaleManager;
import homeworkDay4_2.concrete.GamerManeger;
import homeworkDay4_2.concrete.SaleCheckManager;
import homeworkDay4_2.entities.Game;
import homeworkDay4_2.entities.GameSale;
import homeworkDay4_2.entities.Gamer;





public class Main {

	public static void main(String[] args) {
			Gamer a=new Gamer(1, "seyit", "erdemir",new Date(2000,12,2),"22233344555");
			GamerManeger gamerManager=new GamerManeger();
			gamerManager.add(a);
			gamerManager.delete(a);
			gamerManager.update(a);
			
			System.out.println("---------------------------------------------------------");
			
			Game game=new Game(1,"csgo",50);
			GameManager gameManager= new GameManager();
			gameManager.add(game);
			gameManager.delete(game);
			gameManager.update(game);
			
			
			System.out.println("---------------------------------------------------------");
			
			GameSale gameSale=new GameSale(1, 20);
			GameSaleManager gameSaleManager=new GameSaleManager();
			gameSaleManager.sale(game, gameSale);
			
			
			System.out.println("---------------------------------------------------------");
			
			SaleCheckManager saleCheckManager= new SaleCheckManager();
			saleCheckManager.saleControl(game, gameSale);
			

			
			
	}

}
