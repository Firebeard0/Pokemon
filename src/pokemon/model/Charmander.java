package pokemon.model;

public class Charmander extends Pokemon implements FireType
{
	public Charmander()
	{
		super(200, "Charmander");
		setup();
	}
	public Charmander(String name)
	{
		super(200, "Charmander");
		setup();
	}
	public Charmander(int number, String name)
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
