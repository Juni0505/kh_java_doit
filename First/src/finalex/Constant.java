package finalex;

public class Constant {
	int num = 10;
	final int NUM = 100;
	
	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 50;
	//	cons.NUM = 200; final로 선언된 상수는 값을 바꿀수없
		
		System.out.println(cons.num);
	//	System.out.println(NUM);
	}
}
