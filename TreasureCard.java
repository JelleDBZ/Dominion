package game;

public class TreasureCard extends Card {
	private int valueCard;
        private String ability = null;
	
	public TreasureCard(String name, int cost, int valueCard){
		super(name, cost);
		this.valueCard = valueCard;
                eenTypeKaart = TypeKaart.TREASURE;
                
      }	
	
	/*Card Copper = new TreasureCard("Copper", 0, 1);
	Card Silver = new TreasureCard("Silver", 3, 2);
	Card Gold = new TreasureCard("Gold", 6, 3);*/
	
	
	
	/*((TreasureCard)Copper).getCost();
		casten in e lijst van kaarten */
	
	 /*public int koopDezeKaart(){
		int turnCoins = PlayerCoins - cost; /* cost = 0 */ /* ergens nog een functie maken die coins bijhoudt per turn*/
		/*return turnCoins;
	}*/
	
}
