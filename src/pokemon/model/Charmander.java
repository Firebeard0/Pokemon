package pokemon.model;

public class Charmander extends Pokemon implements FireType
{
	public Charmander(int number, String name)
	{
		super(number, name);
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
