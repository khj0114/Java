package kr.java.func;

import java.io.Serializable;

public class User implements Serializable{
	private String id;
	//transient가 붙은 변수는 직렬화, 역직렬화에서 제외
	private transient String pw;
	private String name;
	private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
}
