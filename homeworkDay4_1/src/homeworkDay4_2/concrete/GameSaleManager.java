package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.GameSaleService;
import homeworkDay4_2.entities.Game;
import homeworkDay4_2.entities.GameSale;

public class GameSaleManager implements GameSaleService {
		@Override
		public void sale(Game game, GameSale gamesale) {
			System.out.println(game.getGameName()+"isimli oyun "+game.getCost()+" fiyat�ndan " + (game.getCost()-gamesale.getDiscountAmount())+ "fiyat�na d��m��t�r");
			
		}

}
