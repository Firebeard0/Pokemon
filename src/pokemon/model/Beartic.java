package pokemon.model;

public class Beartic extends Pokemon implements IceType
{
	public Beartic()
	{
		super(200, "Beartic");
		setup();
	}
	public Beartic(String name)
	{
		super(200, "Beartic");
		setup();
	}
	public Beartic(int number, String name)
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
