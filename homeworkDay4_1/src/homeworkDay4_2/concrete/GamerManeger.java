package homeworkDay4_2.concrete;

import homeworkDay4_2.abstracts.GamerService;
import homeworkDay4_2.entities.Gamer;

public class GamerManeger implements GamerService {
	@Override
	public void add(Gamer gamer) {
		
		System.out.println(gamer.getName() +"  isimli oyuncu kaydedildi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() +"  isimli oyuncu silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName() +"  isimli oyuncu güncellendi.");
		
	}

}
