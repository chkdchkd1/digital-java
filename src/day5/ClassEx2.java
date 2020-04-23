package day5;

public class ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point1.printCount(); //클래스명.메소드명  // 객체가 생성되기 전이니까  생성자의 점 카운트가 올라 가지 않음. 
		Point1 p1 = new Point1(); //기본생성자가 와야한다 것  // 객체 생성 
		p1.printPoint(); //객체 메서드 
		p1.moveXY(4,5);
		p1.printPoint();
		p1.setX1(2);
		p1.printPoint();
		p1.setY1(7);
		p1.printPoint();
		Point1.printCount(); //  카운트  +1 
		Point1 p2 = new Point1(10,10); // 객체 생성ㅇ
		p2.printPoint();
		Point1.printCount(); // 카운트 +2
	}
}

	class Point1{
		private int x1 ; 
		private int y1 ; 
		
		private static int count; //클래스 변수 , 공유함 
		
		
		/* 기능 : 현재 내 좌표를 출력하는 기능  
		 * 매개변수 : 필요 없음 (내 정보이기 때문에) 
		 * 리턴타입 : 없음 (콘솔에 출력하는 거기 때문에 알려줄(반환하는, 돌려줄) 정보는 없다 출력하고 끝내면 되는거기때문에 돌려줄 정보는 없음 ) 
		 * 메소드명: printPoint
		 */
		public void printPoint(){
		//return 값이 없는 경우 리턴타입 void  
			System.out.printf("현재 좌표는 ( %d,%d ) 입니다\n" , x1,y1);
		}
		
		/* 기능 : x,y 좌표가 주어지면 해당 좌표로 이동하는 기능
		 * 매개변수 : x, y 좌표가 필요함 => int x , int y
		 * 리턴타입 : 없음 ( 그냥 이동만하면 되는거고 , 이동했는지를 알려줄 필요가 없기 때문)
		 * 메서드명 : moveXY
		 */
		
		public void moveXY(int x, int y) {
			x1 = x;
		    y1 = y;
		}
		// source - getter and setter 
		 /* getter는 멤버변수가 private인 경우 직접 멤버 변수의 값을 가져 올 수 없기 때문에 멤버변수의 값을 가져 올 수 있는 메서드  
		  * setter는 멤버변수가 private인 경우 직접 멤버 변수의 값을 설정 할 수  없기 때문에 멤버변수의 값을 설정할 수 있는 매서드
		  */
		public int getX1() {
			return x1;
		}

		public void setX1(int x1) {
			this.x1 = x1;
		}

		public int getY1() {
			return y1;
		}

		public void setY1(int y1) {
			this.y1 = y1;
		}
		/* 생성자가 하나도 없으면 기본 생성자를 생략해도 클래스에 기본 생성자가 자동으로 만들어진다.  ex) Point1 p1 = new Point1();
		 *생성자 오버로딩이 되어 있고 기본 생성자가 없으면, 이때는 자동으로 기본 생성자를 만들지 않아서 기본 생성자를 이용한 객체를 만들 수 없다.  
		 * 73번 없고 74만있으면  Point1 p1 = new Point1(); 이부분 에러 */
		//public Point1() {}
		/*public Point1(int x, int y) {
			x1 = x;
			y1 = y;*/
			
		public Point1() {
			count++;
		}
		
		public Point1(int x, int y) {
			count ++;
			x1 = x; y1 = y;
		}
		
		/*
		public static int getCount() {
			return count;
		}

		public static void setCount(int count) {
			Point1.count = count;
		}
		// 이건 클래스 변수 메소드에서도 겟 세터를 쓸 수 있다는 뜻 
		*/ 
		
		
		public static void printCount() {
			//system.out.println(x1); | 에러 발 생, 클래스 메소드(static)에는 객체(멤버)변수를 사용할 수 없다 . 
			//클래스 메서드는 객체 생성없이 사용이 가능하다. x1이라는 객체변수는 객체를 생성해야 사용 할 수 있는 변수이기 때문에 클래스 메서드 에서는 사용 할 수 없다. 
			System.out.printf("지금까지 만들어진 좌표의 갯수 : " + count);
			// x1 = 10; 객체 생성없이 사용가능 하다 = 객체변수를 사용할 수 없다.
 			// setX1(10); 객채 메서드를 클래스 메소드 내에서 사용할 수 없다. 
			
			
		}
		
	
		
}


/* 클래스명 : Point1
   멤버변수 : x1좌표, y1좌표 => 외부에서 접근이 불가능 하도록.
 기능(메서드) : 메서드의 기능 , 나한테 일을 시키는것을 말함 . 나를 기준으로 어떤정보가 필요하고, 어떤 정보를 돌려주어야하는지 생각
 - 현재 좌표를 출력하는 기능
 - x,y좌표가 주어지면 해당 좌표로 이동하는 기능
  -x의 값이 주어지면  x1의 값을 수정하는 기능
  -y의 값이 주어지면 y1 값을 수정하는 기능 
  - x1의 값을 가져오는 기능 
  - y1의 값을 가져오는 기능 
 생성자
 - 기본 생성자 
 - x,y 좌표가 주어졌을 때 객체를 생성하는 생성자 
 
*/