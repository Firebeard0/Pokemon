package pokemon.model;

public class Prinplup extends Pokemon implements WaterType
{
	public Prinplup(int number, String name)
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