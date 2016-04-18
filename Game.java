package game;

import java.applet.Applet;
public class Game extends Applet {
	private static final long serialVersionUID = 1L;
	private int teller;
        private Player player1;
        private Player player2;
        private boolean isGameOver;
        
	public void init(){
            setSize(854, 450);
            player1 = new Player("Jelle");
            player2 = new Player("Michaël");
            isGameOver = false;
	}
        
        public void start() {
            init();
            
            // print alle kaarten in de hand van player 1
            // c = huidige kaart in loop
            for (Card c : player1.getHand()) {
                System.out.println(c.getName());
            }
            //hetzelfde als hierboven
            for (int i = 0; i < player1.getHand().size(); i++) {
                System.out.println(player1.getHand().get(i).getName());
            }
        }    
            // game loop
            /* while (!isGameOver) {
                
            }
            
        }
	/*public void paint(Graphics g){
		g.fillOval(50, 250, 145, 800);
	}*/
	/*public String DitIsEenTest(String Test){
		String NogEenTest = Test;
		return NogEenTest;
	}*/
}

