package kr.co.shop.vo;

public class Product {
	private String name;
	private int price;
	private int amount;
	private int type; //상품의 종류를 구별할 변수(1:셔츠, 2:아우터,3:팬츠)
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int price, int amount, int type) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
