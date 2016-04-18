package game;

public class Card {
	private String name;
	private int cost;
	public enum TypeKaart {TREASURE,VICTORY,ACTION};
        protected TypeKaart eenTypeKaart;
	
	
	public Card(String name, int cost){
		this.name= name;
		this.cost= cost;
	}
	public int getCost(){
		return this.cost;
	}
	public int getAbility(){
		return -1;
	}
	public TypeKaart getType(){
		return eenTypeKaart;
	}

    public String getName() {
        return name;
    }
        
        
	

	
}
