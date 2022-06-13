package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.GameService;
import homeworkDay4_2.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() +"isimli oyun "+game.getCost()+"  fiyattan satýldý");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +"isimli oyun "+game.getCost()+"  fiyattan güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +"isimli oyun silindi");
		
	}

}
