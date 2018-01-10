package pokemon.view;

import pokemon.controller.*;
import pokemon.model.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;


public class PokemonPanel extends JPanel
{
	
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;

	
private JTextArea descriptionArea;
private JTextArea typeArea;

private JButton saveButton;
private JButton clearButton;
private JComboBox pokedexDropdown;

private JPanel firstType;
private JPanel secondType;
private JPanel thirdType;
private JPanel fourthType;

public PokemonPanel(PokemonController appController)
{
	super();
	this.appController = appController;
	
	appLayout = new SpringLayout();
	
	evolvableBox = new JCheckBox();
	nameField = new JTextField("name");
	appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, evolvableBox);
	numberField = new JTextField("##");
	attackField = new JTextField("ap");
	appLayout.putConstraint(SpringLayout.EAST, attackField, -38, SpringLayout.EAST, this);
	healthField = new JTextField("hp");
	appLayout.putConstraint(SpringLayout.WEST, healthField, 362, SpringLayout.WEST, this);
	modifierField = new JTextField("mod");
	appLayout.putConstraint(SpringLayout.EAST, modifierField, -34, SpringLayout.EAST, this);
	
	iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/PokemonPics/Pokemon.jpeg")), JLabel.CENTER);
	
	nameLabel = new JLabel("name");
	appLayout.putConstraint(SpringLayout.WEST, nameLabel, 320, SpringLayout.WEST, this);
	appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
	evolvableLabel = new JLabel("evolvable");
	appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 40, SpringLayout.SOUTH, evolvableLabel);
	appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
	appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 6, SpringLayout.EAST, evolvableLabel);
	numberLabel = new JLabel("number");
	appLayout.putConstraint(SpringLayout.WEST, numberField, 18, SpringLayout.EAST, numberLabel);
	appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 11, SpringLayout.SOUTH, numberLabel);
	appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, numberLabel);
	attackLabel = new JLabel("attack");
	appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, attackLabel);
	appLayout.putConstraint(SpringLayout.WEST, attackField, 6, SpringLayout.EAST, attackLabel);
	appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 27, SpringLayout.SOUTH, attackLabel);
	healthLabel = new JLabel("health");
	appLayout.putConstraint(SpringLayout.EAST, healthLabel, -102, SpringLayout.EAST, this);
	appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, healthLabel);
	appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, healthLabel);
	appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 6, SpringLayout.SOUTH, healthLabel);
	appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, healthLabel);
	appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, healthLabel);
	appLayout.putConstraint(SpringLayout.EAST, healthField, 78, SpringLayout.EAST, healthLabel);
	appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, this);
	modifierLabel = new JLabel("modifier");
	appLayout.putConstraint(SpringLayout.NORTH, modifierField, -5, SpringLayout.NORTH, modifierLabel);
	appLayout.putConstraint(SpringLayout.WEST, modifierField, 6, SpringLayout.EAST, modifierLabel);
	appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 6, SpringLayout.SOUTH, nameField);
	appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, healthLabel);
	
	pokedexDropdown = new JComboBox();
	appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, -4, SpringLayout.NORTH, modifierLabel);
	appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 222, SpringLayout.WEST, this);
	appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, -6, SpringLayout.WEST, modifierLabel);
	clearButton = new JButton("clear");
	appLayout.putConstraint(SpringLayout.SOUTH, clearButton, 0, SpringLayout.SOUTH, this);
	appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, evolvableLabel);
	saveButton = new JButton("save");
	appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, clearButton);
	appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, this);
	
	descriptionArea = new JTextArea(5, 10);
	appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, -99, SpringLayout.SOUTH, this);
	appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, healthLabel);
	appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -6, SpringLayout.NORTH, saveButton);
	typeArea = new JTextArea(4, 15);
	appLayout.putConstraint(SpringLayout.NORTH, typeArea, 10, SpringLayout.SOUTH, pokedexDropdown);
	appLayout.putConstraint(SpringLayout.EAST, typeArea, -6, SpringLayout.WEST, clearButton);
	
	firstType = new JPanel();
	appLayout.putConstraint(SpringLayout.WEST, firstType, 28, SpringLayout.WEST, this);
	appLayout.putConstraint(SpringLayout.SOUTH, firstType, 0, SpringLayout.SOUTH, descriptionArea);
	secondType = new JPanel();
	appLayout.putConstraint(SpringLayout.NORTH, secondType, 0, SpringLayout.NORTH, firstType);
	appLayout.putConstraint(SpringLayout.WEST, secondType, 26, SpringLayout.EAST, firstType);
	thirdType = new JPanel();
	fourthType = new JPanel();
	
	setupPanel();
}

private void setupPanel()
{
	this.setLayout(appLayout);
	this.add(healthLabel);
	this.add(attackLabel);
	this.add(nameLabel);
	this.add(numberLabel);
	this.add(evolvableLabel);
	this.add(modifierLabel);
	this.add(iconLabel);
	this.add(evolvableBox);
	this.add(attackField);
	this.add(healthField);
	this.add(nameField);
	this.add(numberField);
	this.add(modifierField);
	this.add(descriptionArea);
	this.add(typeArea);
	this.add(saveButton);
	this.add(clearButton);
	this.add(pokedexDropdown);
	this.add(firstType);
	this.add(secondType);
}
private void updatePokedexInfo(int index)
{
	nameField.setText(appController.getPokedex().get(index).getName());
	evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
	numberField.setText(appController.getPokedex().get(index).getNumber() + "");
	attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
	healthField.setText(appController.getPokedex().get(index).getHealthPoints() +"");
	modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
	
}


private void setupComboBox()
{
	DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
	pokedexDropdown.setModel(pokemonModel);
}

private void setupTypePanels()
{
	firstType.setSize(50, 50);
	secondType.setSize(50, 50);
	thirdType.setSize(50, 50);
	fourthType.setSize(50, 50);
}


private void updateTypePanels()
{
	String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
	
	if(types[0].equals("IceType"))
	{
		firstType.setBackground(Color.CYAN);
	}
	else if (types[0].equals("FireType"))
	{
		firstType.setBackground(Color.red);
	}
	else if (types[0].equals("WaterType"))
	{
		firstType.setBackground(Color.BLUE);
	}
	else
	{
		firstType.setBackground(Color.WHITE);
	}
}

private void setupListeners()
{
	pokedexDropdown.addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent selection)
		{
			int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
			updatePokedexInfo(selectedPokemonIndex);
//			updateImage();
//			updateTypePanels;
			repaint();
			
		}
			});
}
}