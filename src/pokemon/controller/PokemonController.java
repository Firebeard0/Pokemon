package pokemon.controller;

import pokemon.model.*;
import java.util.List;
import java.util.ArrayList;
import pokemon.view.*;

public class PokemonController
{
private List<Pokemon> pokedex;
private PokemonFrame appFrame;


public PokemonController()
{
	pokedex = new ArrayList<Pokemon>();
	pokedex.add(new Beartic());
	pokedex.add(new Charmander());
	pokedex.add(new Charmellion());
	pokedex.add(new Cubchoo());
	pokedex.add(new Piplup());
	pokedex.add(new Prinplup());
}
public List<Pokemon> getPokedex()
{
	return pokedex;
}

public boolean isValidInteger(String input)
{
	return false;
}
public boolean isValidDouble(String input)
{
	return false;
}
public String [] convertPokedex()
{
	String [] names = new String [pokedex.size()];
	for (int i = 0; i < pokedex.size(); i++)
	{
		names[i] = pokedex.get(i).getName();
	}
	return names;
}
}
