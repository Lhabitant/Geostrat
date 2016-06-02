package fr.iutvalence.info.dut.m2107;

public class Unit {

	protected String Nom;
	protected int unitNumber;
	protected int price;
	protected int statMove;
	protected int statAtt;
	protected int statDef;
	protected boolean waiting;
	protected int lifePoint;
	
	

	/**
	 * used to get the number of the unit
	 */
	public int getNumber() 
	{
		return this.unitNumber;
	}
	
	/**
	 * use it to know if the unit is waiting or not
	 */
	public boolean getWaiting() 
	{
		return this.waiting;
	}

	/**
	 * use it to move your unit
	 */
	public void move() 
	{
		//todo
	}

	/**
	 * use it to attack an unit with an other unit
	 */
	public void attack() 
	{
		//undone
		int damages = this.statAtt / this.statDef;
		this.lifePoint = this.lifePoint - damages;
		if(this.lifePoint == 0 || this.lifePoint < 1)
		{
			suppress();
		}
		changeWaiting();
	}

	/**
	 * delete an unit
	 */
	public void suppress() 
	{
		//undone
		this.Nom = null;
		this.unitNumber = 0;
		this.statMove = 0;
		this.statAtt = 0;
		this.statDef = 0;
		this.waiting = true;
		this.lifePoint = 0;
	}

	/**
	 * put the unit from waiting to not waiting
	 */
	public void changeWaiting() 
	{
		this.waiting = !this.waiting;
	}

	/**
	 * capture a building
	 */
	public void Capturer() 
	{
		//todo
	}

}