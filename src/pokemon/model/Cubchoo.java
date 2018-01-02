package pokemon.model;

public class Cubchoo extends Pokemon implements IceType
{
	public Cubchoo()
	{
		super(100, "Cubchoo");
		setup();
	}
	public Cubchoo(String name)
	{
		super(200, "Cubchoo");
		setup();
	}
	public Cubchoo(int number, String name)
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
