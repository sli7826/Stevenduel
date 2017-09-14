package duel;

public class CharacterB implements Dueler
{
	private int HP;
	
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
		return HP;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int HP) 
	{
		if(d.getHP() == HP)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
