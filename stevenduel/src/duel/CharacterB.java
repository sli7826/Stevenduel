package duel;

public class CharacterB implements Dueler
{
	private int hp;
	
	public CharacterB() 
	{
		
	}
	public String getName()
	{
		return "Bobby";
	}
	public void taunt()
	{
		System.out.println("insert taunt");
	}
	public int getHP()
	{
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) 
	{
		if(d.getHP() == hp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setStartingHP(int hp) 
	{
		this.hp = hp;
	}
}
