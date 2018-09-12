package model;

public class MarshmallowMonster
{
	//------Declaration Section-------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
	//--------------------------------

	public MarshmallowMonster()
	{
		//Default constructor
		//Generally boring and not as helpful
	}

	public MarshmallowMonster(String name)
	{
		this.name = name;
	}

	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}

	public String getName()
	{
		return name;
	}

	public double getLegCount()
	{
		return legCount;
	}

	public int getEyeCount()
	{
		return eyeCount;
	}

	public boolean getHasNoses()
	{
		return hasNoses;
	}

	public int getArmCount()
	{
		return armCount;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}

	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}

	public void setHasNoses(boolean hasNose)
	{
		this.hasNoses = hasNose;
	}

	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}


	@Override
	public String toString()
	{
		String description = "";

		/*"This monster is named " + name
				+ " and it has " + legCount + " legs "
				+ "it has " + eyeCount + " eyes" + " and does it have a nose? " + hasNoses + ". It also has " + armCount + " arms"
				+ " its favorite silly/scary/spooky thing to say is: "
				+ "do you like alphabet soup?";*/

		return description;
	}

}
