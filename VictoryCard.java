package game;

public class VictoryCard extends Card {
	private int valueCard;
	
	public VictoryCard(String name, int cost, int valueCard){
		super(name, cost);
		this.valueCard = valueCard;
		eenTypeKaart = TypeKaart.VICTORY;
	}
	
	
}
