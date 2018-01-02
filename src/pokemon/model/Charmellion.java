package pokemon.model;

public class Charmellion extends Pokemon implements FireType
{
	public Charmellion()
	{
		super(100, "Charmellion");
		setup();
	}
	public Charmellion(String name)
	{
		super(100, "Charmellion");
		setup();
	}
	public Charmellion(int number, String name)
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
	
	
	public String ember(int damage)
	{
		String inflicted = "you've been smoked";
		return inflicted;
	}
	public String flameThrower(int damage)
	{
		String inflicted = "You've been scorched";
		return inflicted;
	}
	public String inferno(int damage)
	{
		String inflicted = "You have been incinerated";
		return inflicted;
	}
}
