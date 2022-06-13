package homeworkDay4_2.entities;

public class Game {
	private int gameId;
	private String gameName;
	private int cost;
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public Game(int gameId, String gameName, int cost) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.cost = cost;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
