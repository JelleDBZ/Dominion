package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {
	private String name;
	private int currentCoins;
        private Deck deck; // 'Deck' is de naam van de klasse die gebruikt wordt, 'deck' is de naam die gebruikt wordt in deze klasse die 'Deck' vertegenwoordigt
        private List<Card> playerHand;
        private List<Card> playerDeck;
	
	public Player(String name){
		this.name = name;
		this.currentCoins = 0;
                //maak een lijst van kaarten aan die in deck komen
                List<Card> kaartenInDeck = new ArrayList<>();
                for (int i = 0; i < 10; i++) {
                    Card copper = new TreasureCard("Copper", 0, 1); 
                    Card silver = new TreasureCard("Silver", 3, 2);
                    Card gold = new TreasureCard("Gold", 6, 3);
                    Card estate = new VictoryCard("Estate", 2, 1); /* 24 estates */
                    Card duchy = new VictoryCard("Duchy", 5, 3); /* 12 duchies */
                    Card province = new VictoryCard("Province", 8, 6);/* 12 provinces */
                    
                    kaartenInDeck.add(copper);
                    kaartenInDeck.add(silver);
                    kaartenInDeck.add(gold);
                    kaartenInDeck.add(estate);
                    kaartenInDeck.add(duchy);
                    kaartenInDeck.add(province);
                    
                    Collections.shuffle(kaartenInDeck);
                }
                //maak deck aan met de vorige lijstc 
                this.deck = new Deck(kaartenInDeck);
                this.playerDeck = deck.getCards(10);
                
		/* this.cards = new Array List<>(); */
	}
        
	public void legCard(Card kaart){
            // if card is in hand -> leg card
            if (playerDeck.contains(kaart)) {
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

    public List<Card> getPlayerDeck() {
        return playerDeck;
    }
        
        
}
