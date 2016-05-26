package fr.iutvalence.info.dut.m2107;

public class Solider extends Unite
{
	public void MySoldier()
	{
		super.Nom = "Fantassin";
		super.numeroUnite = 0;
		super.prix = 0;
		super.statDepla = 5;
		super.statAtt = 5;
		super.statDef = 2;
		super.EtatAttente = true;
		super.pDV = 10;
	}
}
