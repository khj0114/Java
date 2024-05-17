package kr.co.iei.Game;

public class Healer extends Character{
	private int heal;
	private int buff;
	public Healer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Healer(String name, int attack, int hp, int defend, int type) {
		super(name, attack, hp, defend, type);
		// TODO Auto-generated constructor stub
	}
	public Healer(String name, int attack, int hp, int defend, int type, int heal, int buff) {
		super(name, attack, hp, defend, type);
		this.heal = heal;
		this.buff = buff;
	}
	public int getHeal() {
		return heal;
	}
	public void setHeal(int heal) {
		this.heal = heal;
	}
	public int getBuff() {
		return buff;
	}
	public void setBuff(int buff) {
		this.buff = buff;
	}
	
	
}
