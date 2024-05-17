package kr.co.iei.Game;

public class Member extends Character{
	private String name; 		// 이름
	private String id; 			// 아이디
	private String pw;		 	// 패스워드
	
	private String gameCharacter;	// 게임 캐릭터 픽
	
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Member(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
}
