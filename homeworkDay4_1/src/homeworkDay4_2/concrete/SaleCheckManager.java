package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.SaleCheckService;
import homeworkDay4_2.entities.Game;
import homeworkDay4_2.entities.GameSale;

public class SaleCheckManager  implements SaleCheckService{
	
	@Override
	public boolean saleControl(Game game, GameSale gameSale) {
		if(gameSale.getId()==1) {
			System.out.println(game.getGameName()+"  isimli oyunda "+ gameSale.getDiscountAmount()+ " miktarda indirim bulunmakta");
			return true;
		}else {
			return false;
		}
		
		
	}

}
