package kr.co.iei.Game;

public class Character {
	
	private String name;
	private int Attack;
	private int Hp;
	private int defend;
	private int type;
	public Character() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Character(String name, int attack, int hp, int defend, int type) {
		super();
		this.name = name;
		this.Attack = attack;
		this.Hp = hp;
		this.defend = defend;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttack() {
		return Attack;
	}
	public void setAttack(int attack) {
		Attack = attack;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getDefend() {
		return defend;
	}
	public void setDefend(int defend) {
		this.defend = defend;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
