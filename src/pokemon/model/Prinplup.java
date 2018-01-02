package pokemon.model;

public class Prinplup extends Pokemon implements WaterType
{
	public Prinplup()
	{
		super(200, "Prinplup");
		setup();
	}
	public Prinplup(String name)
	{
		super(200, "Prinplup");
		setup();
	}
	public Prinplup(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(200);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(134);
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