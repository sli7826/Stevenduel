package duel;

public class CharacterA implements Dueler{
	private int hp;
	private int round = 0;
	private boolean load=false;
	public CharacterA() {	
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
			if(round==0) {
				load=true;
				return 0;
			}
			private int Interger(Math.random()*4);
						
		}
				
	}
}
