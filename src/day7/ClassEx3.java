package day7;



public class ClassEx3 { //접근제한자 퍼블릭은 클래스명과 파일명이 같아야 쓸 수 있다. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		KiaCar.printInfo(); //클래스 매서드 호출은 클래스명. 클래스메서드명 또는 객체. 클래스메서드명 둘다가능 
		KiaCar c1 = new KiaCar();
		//c1.printInfo(); //객체.메소드명 가능은 하지만 권장은 하지 않음 
		c1.printCarInfo();
		KiaCar.printInfo();
		
		KiaCar c2 = new KiaCar("뉴그랜드버드",6);
		c2.printCarInfo();
		KiaCar.printInfo();
		for(int i = 0; i<10; i++) {
			c2.speedUp();
			c2.printSpeed();
		}
		for(int i = 0; i<20; i++) {
			c2.speedDown();
			c2.printSpeed();
		}

	}

}
// 모닝, k3, 쏘렌토  
class KiaCar {
	
	// 클래스 변수 (클래스명 만 보고 알수 있는거 ..? 객체가 만들어지는거랑 상관없이 만들어지는것들 )
	private static String manufactuer = "KIA";
	private static int salesNumber = 0;
	
	// 객체 변수
	int wheel;
	boolean power; 
	int speed;
	String carname;
	String carnum;
	
	//클래스 메서드 (클래스 변수 private ~ 의 값을가져오는 ) 
	public static String getManufactuer() {
		return manufactuer;
	}
	public static int getSalesNumber() {
		return salesNumber;
	}
	
	public static void printInfo() {
		System.out.println("제조사 : " + manufactuer);
		System.out.println("판매량 : " + salesNumber + "대");
		
	}
	
	//객체 메서드 
	public void turnOn() {
		System.out.println("시동이 켜졌습니다.");
		power = true;
	}
	public void turnOff() {
		if(speed == 0) {
			System.out.println("시동이 꺼집니다");
			power = false;
		}else {
			System.out.println("속도가 0이 아니어서 시동을 끌 수 없습니다");
		}
	}
	
	public void speedUp() {
		speed++;
	}
	public void speedDown() {
		if(speed > 0) {
			speed--;
		}
	}
	public void printSpeed() {
		System.out.println("현재 주행 속도는 " + speed +"km/h 입니다.");
	}
	
	public void printCarInfo() {
		System.out.println("차종 : " + carname);
		System.out.println("바퀴수 : " + wheel);
		printSpeed();
	}
	
	//생성자 
	public KiaCar() {
		wheel = 4;
		carname = "";
		salesNumber++;
		
	}
	public KiaCar(String carName, int wheel) {
		this.carname = carName;
		this.wheel = wheel;
		/* 멤버 변수 wheel과 매개변수의 이름이 같으면 매개변수의 우선순위가 높다. 
		 * 이러한 경우 멤버 변수를 의미하기 위해 변수명 앞에 this 와 .을 써서
		 * this.멤버변수명 으로 사용한다. this는 자기자신을 의미하는 객체  */
		salesNumber++;
	}
	
	
	
	
	
}