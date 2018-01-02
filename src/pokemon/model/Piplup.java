package pokemon.model;

public class Piplup extends Pokemon implements WaterType
{
	public Piplup()
	{
		super(100, "Piplup");
		setup();
	}
	public Piplup(String name)
	{
		super(200, "Piplup");
		setup();
	}
	public Piplup(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(100);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(50);
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
