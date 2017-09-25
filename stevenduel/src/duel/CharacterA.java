package duel;

public class CharacterA implements Dueler{
	private int hp;
	private boolean round;
	private boolean load;
	public CharacterA() {
		round = false;
		load = false;
	}
	public void taunt() {
		System.out.println("You Suck.");
	}
	public String getName() {
		return "Bob";
	}
	public void setStartingHP(int hp) {
		this.hp=hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP()==hp) 
			return true;
		return false;
	}
	public int getAction(Object caller) {
		if(!(caller instanceof Duel))
			return 3;
		else {
			if(!round) {
				round=true;
				load=true;
				return 0;
			}
			if(load) {
				if(Math.random()>.5) {
					load=false;
					return 1;
				}
				return 2;
			}
			else {
				if(Math.random()>.5) {
					load=true;
					return 0;
				}
				return 2;
			}
		}						
	}
	public void hit(Object caller) {
		if((caller instanceof Duel))
			hp-=10;
	}
}
