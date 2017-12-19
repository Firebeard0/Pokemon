package pokemon.model;

public class Piplup extends Pokemon implements WaterType
{
	public Piplup(int number, String name)
	{
		super(number, name);
	}
	
	public String drizzle(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
	public String flood(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
	public String tsunami(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}

}
