package pokemon.model;

public class Charmander extends Pokemon implements FireType
{
	public Charmander(int number, String name)
	{
		super(number, name);
	}
	
	public String ember(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
	public String flameThrower(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
	public String inferno(int damage)
	{
		String inflicted = "1";
		return inflicted;
	}
}
