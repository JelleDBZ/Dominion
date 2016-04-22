package game;

import java.util.List;

public class Deck {
    private List<Card> kaarten;

    public Deck(List<Card> kaarten) {
        this.kaarten = kaarten;
    }

    public List<Card> getKaarten() {
        return kaarten;
    }

    public void setKaarten(List<Card> kaarten) {
        this.kaarten = kaarten;
    }
    
    public List<Card> getCards(int amount) {
        List<Card> laatsteKaarten = kaarten.subList(kaarten.size()-amount, kaarten.size());
        return laatsteKaarten;
        /* 100-5=95
        size == 100
        95,96,97,98,99
        */
        
    }
    
    /*public void shuffle() {
        Collections.shuffle(kaarten);
    }*/
}
