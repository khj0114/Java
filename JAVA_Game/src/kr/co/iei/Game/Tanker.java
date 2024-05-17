package kr.co.iei.Game;

public class Tanker extends Character{
	private int Shield;

	public Tanker() {
		super();
	}

	public Tanker(String name,int attack, int hp, int defend, int type) {
		super(name, attack, hp, defend, type);
	}

	public Tanker(String name,int attack, int hp, int defend, int type, int shield) {
		super(name, attack, hp, defend, type);
		Shield = shield;
	}

	public int getShield() {
		return Shield;
	}

	public void setShield(int shield) {
		Shield = shield;
	}
	
}
