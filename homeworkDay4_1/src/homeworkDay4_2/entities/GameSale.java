package homeworkDay4_2.entities;

public class GameSale {
	private int id;
	private int discountAmount;
	
	 public GameSale() {
		// TODO Auto-generated constructor stub
	}

	public GameSale(int id, int discountAmount) {
		super();
		this.id = id;
		this.discountAmount = discountAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
}
