package fr.iutvalence.info.dut.m2107;

public class Soldier extends Unit
{
	/**
	 * a triangle is a soldier
	 * default stats when created
	 */
	public Soldier()
	{
		super.Nom = "Triangle";
		super.unitNumber = 0;
		super.price = 0;
		super.statMove = 5;
		super.statAtt = 7;
		super.statDef = 2;
		super.waiting = true;
		super.lifePoint = 10;
	}
}
