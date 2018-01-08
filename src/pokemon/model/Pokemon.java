package pokemon.model;

import java.util.ArrayList;

public abstract class Pokemon
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon (int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public final String[] getPokemonTypes()
	{
		String [] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		Class <?> currentClass = this.getClass();
		
		while(currentClass.getSuperclass() != null)
		{
		Class<?>[] pokemonTypes = getClass().getInterfaces();
	types = new String[pokemonTypes.length];
	
	for(int index = 0; index < types.length; index++)
	{
		String currentInterface = pokemonTypes[index].getCanonicalName();
		currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
		types[index] = currentInterface;
	}
	
	currentClass = currentClass.getSuperclass();
		}
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
				
				return types;
	}
	public String toString()
	{
		String description = "Hi, I am a" + name + ", and my HP is" + healthPoints;
		
		return description;
 	}
	public String getPokemonInformation()
	{
		String pokemonInfo = "This Pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	
	
	public int getHealthPoints()
	{
		return healthPoints;
	}

	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	public int getAttackPoints()
	{
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	public double getEnhancementModifier()
	{
		return enhancementModifier;
	}

	public void setEnhancementModifier(double enhancementModifier)
	{
		this.enhancementModifier = enhancementModifier;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}

	public int getNumber()
	{
		return number;
	}
}
