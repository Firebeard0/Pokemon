package pokemon.model;

public class Beartic extends Pokemon implements IceType
{
	public Beartic(int number, String name)
	{
		super(number, name);
	}
	
	public String freeze(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
	public String icicles(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
	public String blizzard(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}

}
