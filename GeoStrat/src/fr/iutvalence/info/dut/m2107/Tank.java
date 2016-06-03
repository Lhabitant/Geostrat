package fr.iutvalence.info.dut.m2107;

public class Tank extends Unit 
{
	/**
	 * a square is a tank
	 * default stats when created
	 */
	public Tank()
	{
		super.Nom = "Square";
		super.unitNumber = 0;
		super.price = 0;
		super.statMove = 2;
		super.statAtt = 2;
		super.statDef = 5;
		super.waiting = true;
		super.lifePoint = 15;
	}
}
