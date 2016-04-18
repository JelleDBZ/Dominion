package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private int currentCoins;
        private Deck deck; // 'Deck' is de naam van de klasse die gebruikt wordt, 'deck' is de naam die gebruikt wordt in deze klasse die 'Deck' vertegenwoordigt
        private List<Card> hand;
	
	public Player(String name){
		this.name = name;
		this.currentCoins = 0;
                //maak een lijst van kaarten aan die in deck komen
                List<Card> kaartenInDeck = new ArrayList<>();
                for (int i = 0; i < 5; i++) {
                    Card copper = new TreasureCard("Copper", 0, 1); 
                    Card silver = new TreasureCard("Silver", 3, 2);
                    Card gold = new TreasureCard("Gold", 6, 3);
                    kaartenInDeck.add(copper);
                    kaartenInDeck.add(silver);
                    kaartenInDeck.add(gold);
                }
                //maak deck aan met de vorige lijstc 
                this.deck = new Deck(kaartenInDeck);
                this.hand = deck.getCards(5);
                
		/* this.cards = new Array List<>(); */
	}
        
	public void legCard(Card kaart){
            // if card is in hand -> leg card
            if (hand.contains(kaart)) {
                // als kaart een TreasureCard is, tel de value van de
                // TreasureCard bij het aantal coins van de speler
                if(kaart instanceof TreasureCard){
                    currentCoins += ((TreasureCard)kaart).getCost(); 
                }
            }
            //doe niks
	}

    public String getName() {
        return name;
    }

    public int getCurrentCoins() {
        return currentCoins;
    }

    public Deck getDeck() {
        return deck;
    }

    public List<Card> getHand() {
        return hand;
    }
        
        
}
