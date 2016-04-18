package game;

public class VictoryCard extends Card {
	private int valueCard;
	
	public VictoryCard(String name, int cost, int valueCard){
		super(name, cost);
		this.valueCard = valueCard;
		
	}
	
	Card Estate = new VictoryCard("Estate", 2, 1); /* 24 estates */
	Card Duchy = new VictoryCard("Duchy", 5, 3); /* 12 duchies */
	Card Province = new VictoryCard("Province", 8, 6);/* 12 provinces */
}
