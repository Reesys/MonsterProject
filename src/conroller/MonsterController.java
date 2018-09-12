package conroller;

import java.util.Scanner;

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
		myMonster = new MarshmallowMonster("Jeff", 2.2, 7 , true, 3);
		userMonster = new MarshmallowMonster();
		inputScanner = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println(myMonster);

		System.out.println("What would you like to name your monster?");
		String name = inputScanner.nextLine();
		userMonster.setName(name);
		System.out.println("Your monster name is " + userMonster.getName());

		System.out.println(" ");
		System.out.println("How many legs does " + name + " have?");
		double legCount = inputScanner.nextDouble();
		userMonster.setLegCount(legCount);
		System.out.println("Your monster has " + userMonster.getLegCount() + " legs.");

		System.out.println(" ");
		System.out.println("How many eyes does " + name + " have?");
		int eyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(eyeCount);
		System.out.println("Your monster has " + userMonster.getEyeCount() + " eyes.");

		System.out.println(" ");
		System.out.println("Does " + name + " have a nose?");
		boolean hasNoses = inputScanner.nextBoolean();
		userMonster.setHasNoses(hasNoses);
		System.out.println("Your monster having a nose is  " + userMonster.getHasNoses());

		System.out.println(" ");
		System.out.println("How many arms does " + name + " have?");
		int arms = inputScanner.nextInt();
		userMonster.setArmCount(arms);
		System.out.println("Your monster has " + userMonster.getArmCount() + " arms.");

		System.out.println(" ");
		System.out.println("Afer putting in all that informaion your monster has " + userMonster.getArmCount()
		+ " arms, has " + userMonster.getEyeCount()
		+ " eyes, you said its nose is " + userMonster.getHasNoses() + ", its leg count is "
		+ userMonster.getLegCount() + ", and you named it " + userMonster.getName() + ".");
	}
}
