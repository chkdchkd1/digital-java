package day53;

public class Ex1 {

	public static void main(String[] args) {
		
		//https://www.acmicpc.net/
		/*1. 변수
		- 일반 변수 : 값을 저장하는 변수 
		  - 정수형 : int,byte,short,long
		  - 실수형 : float(4), double(8)
		  - 문자형 : char
		- 참조변수 : 주소를 저장하는 변수 (실제 값 X)
		- 자료형변환 : 변수나 상수 값의 자료형을 일시적으로 다른 자료형으로 변환 시키는 것 
		  - 자동 : 정수 - > 실수, 작은 바이트-큰바이트 
		  - 명시적 : 자동 자료형변환이 되지 않아서 에러가 발생 / 자료형변환이 필요한 경우 
		*/
		
		int num1 = 10; 
		// = 을 기준으로 왼쪽은 int(정수)이고, 오른쪽은  double(실수)이어서 자동 자료형변환이 되지 않아 에러가 발생 
		int num2 = (int)1.23; // 명시적 자료형변환을 통해 에러 제거  
	    // int(4) = char(2)이기 때문에 자동 자료형 변환이 되어서 에러가 발생하지 않는다 
		int num3 =  'A';
		char ch1 = (char)1234567890; // 12는 되지만 1234567890이라는 숫자가 커서 2바이트로 표현할 수 없기 때문에 에러발생 
		//1.23은  double형 실수이기 때문에  float으로 자동형변환이 되지않아 에러 발생 
		float num4 = (float)1.23; 
		float num5 = 1.23f;
		
		
		/*float vs doulbe 
		 * - 4바이트  vs 8바이트
		 * - 소수점 7자리  vs 소수점 15자리 
		 * - 접미사  f필요  vs 접미사 필요 X */
		
		/* 2. 연산자 
		 * - 대입연산자 (=)
		 *   - 오른쪽에 있는 값을 왼쪽에 저장
		 *   - 왼쪽에는 무조건 변수/객체게 와야한다. 
		 *   - 왼쪽과 오른쪽의 자료형이 같아야한다.
		 *   - 오른쪽에 있는 값의 자료형이 왼쪽에 있는 값의 자료형으로 형변환이 가능해야한다.
		 * - 산술연산자 
		 *   - / : 0으로 나눌 수 없다. 정수/정수 = 정수 
		 * - 논리연산자(&&, ||, !)
		 *   - 결과가 참 또는 거짓 => 조건식 
		 *   - &&  : ~ 하고, 둘다 참이면 참 나머진다 거짓
		 *   - ||  : ~하거나, 둘다 거짓아니면 거짓, 나머진 다함
		 *   - !    : 반대, 거짓이면 참, 참이면 거짓
		 * - 비교연산자
		 *   - 조건식
		 *   - == 와 = 을 구분 
		 *   - 조건선택연산자(조건? 값1:값2;)
		 *     조건식이 참이면 값1을, 거짓이면 값2을 선택  
		 * - 증감연산자 (++. --)
		 *   - 최종적으로 1증가, 1감소 */
	    
		/*3. 조건식 : ..하면 ~한다.
		 * - if문
		 * if(조건식1) {
		 * 		실행문1
		 * 조건1에 해당하면(true) 실행문1; 조건식1이 거짓(false)이고 조건2에 해당하면(true) 실행문2 다 해당안되면(false) 실행문3 실행 ; 
		 *
		 * } else if (조건2){
		 * 		실행문2;
		 } else {
		 		실행문3;
		 } */
		 
		/*3-1 switch문 : 변수가 값1과 같으면 실행문 1을 실행 , 값1과 다르고 값2와 같으면 실행문 2를 실행, 변수가 값1과 값2와 같지 않으면 실행문3 
		 * switch(변수){
		 * case 값 1 : 
		 * 		실행문1;
		 * 		berak;
		 *  case 값 2 : 
		 * 		실행문2;
		 * 		berak;
		 *  case 값 3 : 
		 * 		실행문3;
		 * 		berak;
		 * default:
		 * 		실행문 4
		 * }
		 * - 변수가 사용하는 값이 제한적인 경우
		   - 변수가 아닌, 식이 들어가서 식의 값이 제한적일 때 (%)
		 */
		
		/*4. 반복문 : 규칙성, 반복횟수
		 * - for문
		 * for(1.초기화;2.조건식;4.증감연산식){
		 * 			3.실행문;
		 * }
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화, 생략가능
		 * 2. 조건식 : 반복문이 실행되기위한 조건으로, 참이면 반복문 실행, 거짓이면 반복문 종료, 생략가능
		 * 4. 증감연산식 : 조건식에서 사용하는 변수를 증가 또는 감소 => 반복횟수를 조정하기 위해, 생략가능*/
		
		/* - while문
		 * while(조건식){
		 * 			실행문;
		 * }*/
		
		/* - do while문 
		 * do {
		 * 		실행문
		 * }while(조건식);
		 * - 최소 1번은 실행되는 반복문*/
		
		/*
		 * - break : 반복문을 빠져나가는 역할 (switch문을 빠져나가는 역할)
		 * 	 - if문과 같이 쓰임  (조건이 있어야한다는 말 )
		 * 
		 * - continue : continue를 만나면 for문의 경우 증감연산식으로, while문 경우 조건식으로 */
		
		/*5. 배열 
		 * 	- 동일한 자료형을 가진 데이터를 모아 놓은 것 
		 *  - 배열 선언
		 *     자료형 배열 [];
	     *     자료형[] 배열명;
		 * - 배열 생성 
		 *     자료형 배열명 [] = new 자료형[갯수];
		 * - 0번지 부터 시작
		 * - 마지막번지는 크기 -1번지 
		 * - 배열에 값을 설정할 때
		 *     배열명[번지] = 값;
		 * - 배열에 있는 값을 가져옮
		 *     변수 = 배열명[번지];
		 */
		
		/*6. 클래스  : 데이터를 편리하게 관리하기 위해서 
		 * - 멤버변수 
		 * - 멤버메서드 
		 * - 생성자 
		 * 
		 * 
		 * >> 변수 일수도 클래스 일수도 
		 * - 클래스 멤버 (static)
		 * 	- 모든 객체들이 공유하는 멤버 
		 *  - 객체를 생성하지 않고 호출 
		 *  - 클래스를 사용할 때 
		 * - 객체 멤버 
		 *   - 각 객체 마다 멤버를 가지고 있다. 
		 *   - 객체를 생성한 후에 호출 
		 *   - 객체를 생성할 때 (new 연산자를 통해)
		 *   
		 *  ++ 클래스 멤버 변수를 클래스 멤버 메서드에서 호출 할 수 있다. O
		 *  ++ 클래스 멤버 변수를 객체 멤버 메서드에서 호출 할 수 있다. O 
		 *   - - 클래스가 임폴트 될때  클래스 메서드도 생성된다. ( 객체 생성 되기전에 클래스가 생성) 
		 *  ++ 객체 멤버 변수를 객체 멤버 메서드에서 호출 할 수 있다. O  
		 *  ++ 객체 멤버 변수를 클래스 멤버 메서드에서 호출 할 수 있다. X
		 *   - - 객체 생성전에 호출이라  X 
		 *   
		 *   
		 *   
		 * - ㅁㅔ서드 : 기능 =>입력정보 => 매개변수 => 결과물 (리턴타입)
		 *  - 기능 정리
		 *  - 매개변수 : 메서드를 실행하기 위해 필요한 최소한의 정보 
		 *  - 리턴타입 : 기능이 실행된 후 알려줘야하는 정보 
		 *  - 메소드명
		 *  
		 *  - 메소드를 만드는 이유 
		 *    - 재사용성을 높여서 코드의 길이를 줄임
		 *    - 유지 보수를 쉽게 하기 위해서 
		 * */
		
		/* 메서드 오버로딩 : 이름이 같은 메서드가 여러개인경우 
		 * - 매개변수가 다를 때 
		 *     매개변수의 타입이 다른경우, 갯수가 다른경우 */
		
		
	}

}
