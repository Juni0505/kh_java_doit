package innerclass;

public class OutClass {		//외부클래스
	private int num = 10;		//외부 클래스 private 변수	
	private static int sNum = 20;	//	외부 클래스 정적 변수
	
	private InClass inClass;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
		static void sTest() {
			//num += 10;
			//inNum += 10;		외부 클래스와 내부 클래스의 인스턴스 변수는 사용할 수 없으므로 주석 처리
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
		}
	}
	public OutClass() {
		inClass = new InClass();
	}
	class InClass{
		int inNum = 100;
		//static int sInNum = 200; 인스턴스 내부 클래스에 정적 변수 선언 불가능.
		
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수)");
		}
		//static void sTest() {} 정적메소드 역시 정의 불가능.
		
	}
	public void usingClass() {
		inClass.inTest();
	}
}
