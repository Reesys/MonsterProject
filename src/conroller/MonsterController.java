package conroller;

import model.MarshmallowMonster;

public class MonsterController
{
	//Data member section
	//Declaration section
	private MarshmallowMonster myMonster;

	//Constructors initialize data members!
	public MonsterController()
	{
		myMonster = new MarshmallowMonster("Todd", 2.5, 1, true, 2);
	}

	public void start()
	{
		System.out.println(myMonster);
	}
}
