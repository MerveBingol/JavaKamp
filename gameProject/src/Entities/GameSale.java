package Entities;

import Abstract.Entity;

public class GameSale implements Entity  {
	
	private int id;
	private String gameName;
	private float gamePrice;
	
	public GameSale() {
	
	}

	public GameSale(int id, String gameName, float gamePrice) {
		this();
		this.id = id;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public float getGamePrice() {
		return gamePrice;
	}

	public void getGamePrice(float gamePrice) {
		this.gamePrice = gamePrice;
	}
	

}
