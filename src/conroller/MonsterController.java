package conroller;

import java.util.Scanner;

import javax.swing.JOptionPane;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;

	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster();
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}

	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);

		System.out.println(myMonster);

		/*System.out.println("What would you like to name your monster?");
		JOptionPane.showMessageDialog(null, "What would you like to name your monster?");
		String name = inputScanner.nextLine();*/

		String userInput = JOptionPane.showInputDialog(null, "What would ou like to name your monster?");

		userMonster.setName(userInput);
		//System.out.println("Your monster name is " + userMonster.getName());

		System.out.println(" ");
		//System.out.println("How many legs does " + name + " have?");
		String userInput1 = JOptionPane.showInputDialog(null, "How many legs does have?");
		//double legCount = inputScanner.nextDouble();
		double legCount = -99;
		if(validDouble(userInput1))
		{
			legCount = Double.parseDouble(userInput1);
		}

		userMonster.setLegCount(legCount);
		//System.out.println("Your monster has " + userMonster.getLegCount() + " legs.");

		//System.out.println(" ");
		//System.out.println("How many eyes does " + name + " have?");
		String userInput2 = JOptionPane.showInputDialog(null, "How many eyes does have?");
		int eyeCount = -99;
		if(validInt(userInput2))
		{
			eyeCount = Integer.parseInt(userInput2);
		}

		//int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		//System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes.");

		//System.out.println(" ");
		//System.out.println("Does " + name + " have a nose?");
		String userInput3 = JOptionPane.showInputDialog(null, "Does it have a nose?");

		boolean answer = Boolean.parseBoolean(userInput3);

		//boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(answer);
		//System.out.println("Your monster having a nose is  " + userMonster.getHasNoses());

		//System.out.println(" ");
		//System.out.println("How many arms does " + name + " have?");
		String userInput4 = JOptionPane.showInputDialog(null, "How many arms does it have?");
		int arms = -99;
		if(validInt(userInput4))
		{
			arms = Integer.parseInt(userInput4);
		}

		//int arms = inputScanner.nextInt();
		userMonster.setArmCount(arms);
		//System.out.println("Your monster has " + userMonster.getArmCount() + " arms.");

		System.out.println(" ");
		JOptionPane.showMessageDialog(null, "After putting in all that informaion your monster has " + userMonster.getArmCount()
		+ " arms, has " + userMonster.getEyeCount()
		+ " eyes, you said its nose is " + userMonster.getHasNoses() + ", its leg count is "
		+ userMonster.getLegCount() + ", and you named it " + userMonster.getName() + ".");
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number.");
		}

		return isValid;
	}

	public boolean validDouble(String mightBeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(mightBeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "Type in a decimal value AKA a number with a . in the middle.");
		}

		return isValid;
	}
}
