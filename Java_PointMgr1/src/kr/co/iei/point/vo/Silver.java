package kr.co.iei.point.vo;


public class Silver {
	private String name;
	private String grade;
	private int point;
	
	//매개변수 없는 생성자
	//모든변수에대한 매개변수가 있는 생성자
	//getter
	//setter
	
	public Silver() {
		
	}
	public Silver(String name,String grade,int point) { 
		this. name = name;
		this. grade = grade;
		this. point = point;
		
	}
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getPoint() {
		return point;
	}
	//bonus는 point의 종속적인 데이터이므로 따로 변수처리를 하지않고
	//데이터가 필요한 경우 point를 연산해서 값을 주는 getter만 추가
	public double getBouns() {
		return point*0.02;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPoint(int point) {
		this.point = point;
	}
		
	
}
