package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;
import pokemon.view.PokemonPanel;

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokemonPanel appPanel;
	public PokemonFrame(PokemonController appController)
	{
	super();
	this.appController = appController;
	appPanel = new PokemonPanel(appController);
	setupFrame();
	}


private void setupFrame()
{
	this.setContentPane(appPanel);
	this.setResizable(false);
	this.setTitle("Pokemon");
	this.setSize(700, 700);
	this.setVisible(true);
}
}