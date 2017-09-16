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
		System.out.println("Come at me");
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
	
	private int Round
	 = 0;
	public int getAction(Object Caller)
	{
		
		if (!(Caller instanceof Duel) == true)
		{
			return 3;				
		}
		else
		{
			if (Math.random() > 0.66)
			{
				return 0;
			}
			else
			{
				if (Math.random() < 0.33)
				{
					return 1;
				}
				else
				{
					return 2;
				}
			}				
		}
		
	}
	public void hit(Object Caller)
	{
		if (Caller instanceof Duel)
		{
			hp = hp - 10;
		}
	
	}
}
