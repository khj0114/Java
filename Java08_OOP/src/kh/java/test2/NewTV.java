package kh.java.test2;

public class NewTV {
	//속성 : 크기, 전원, 채널 ,볼륨
	private int inch;
	private boolean power;	
	private int volume;
	private int channel;
	
	
	//생성자 : 객체를 생성할때 호출하는 메소드
	//생성자 만드는 방법
	//1. 접근제어 지시자는 public
	//2. 반환형(리턴타입)은 없음(void가 아니라 진짜 없음)
	//3. 메소드이름 : 클래스명과 동일
	//4. 매개변수와 실행코드는 상황에따라서 다름
	//생성자를 만약 1개도 작성하지 않으면 JVM이 실행시 기본생성자를 자동으로 작성한다
	//생성자는 필요에따라서 오버로딩을 통해서 여러개를 만드는것이 가능
	
	//기본생성자 -> 매개변수가 1개도 없는 생성자, 값초기화를 하지않고 객체를 생성하는 역할만 함
	public NewTV() {
		
	}
	//전역변수를 모두 초기화하는 생성자
	public NewTV(int inch, boolean power, int channel, int volume) {
		this.inch = inch;
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	
	
	//getter 생성(외부에서 이 메소드를 이용해서 전역변수의 데이터를 가져오기위한 메소드)
	//1.접근 제어지시자는 public
	//2.반환형(리턴타입)은 변수의 자료형과 동일
	//3.메소드의 이름은 get변수명 -> 카멜포기법
	//4.매개변수는 없음
	//5.소스코드 : 전역변수값을 리턴
			
	//inch변수에 대한 getter
	public int getInch() {
		return inch;
	}
	//boolean형 데이터의 getter는 메소드 이름 작성할때 get변수명 -> is변수명
	//power 변수에 대한 getter
	public boolean isPower() {
		return power;
	}
	
	//channel 변수에 대한 getter
	public int getChannel() {
		return channel;
	}
	
	//volume 변수에 대한 getter
	public int getVolume() {
		return volume;
	}
	
	//setter 생성(외부에서 이 메소드를 이용해서 전역변수의 데이터를 수정하기 위한 메소드)
	//1. 접근제어지시자 public
	//2. 반환형(리턴타입) : void
	//3. 메소드의 이름 set변수명 -> 카멜표기법
	//4.매개변수는 변수의 자료형과 동일것으로 1개
	//5.소스코드는 매개변수로 받은 데이터를 전역변수에 대입
	
	
	public void setInch(int inch) {
		//this.변수 -> 해당 클래스의 전역변수를 지칭하는 키워드
		this.inch = inch;
	}
	
	//power 변수에 대한 setter
	public void setPower(boolean power) {
		this.power = power;
	}

	//channel 변수에 대한 setter
	public void setChannel(int Channel) {
		this.channel = channel;
	}

	//volume 변수에 대한 setter
	public void setVolume(int Volume) {
		this.volume = volume;
	}
 }
