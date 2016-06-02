package fr.iutvalence.info.dut.m2107;

public class Engineer extends Unit 
{
	/**
	 * a circle is a unit that can capture (engineer)
	 * default stats when created
	 */
	public Engineer()
	{
		super.Nom = "Ciclre";
		super.unitNumber = 0;
		super.price = 0;
		super.statMove = 8;
		super.statAtt = 1;
		super.statDef = 2;
		super.waiting = true;
		super.lifePoint = 8;
	}
}
