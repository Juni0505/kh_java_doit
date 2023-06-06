package chapter2;

public class Exam {

	public static void main(String[] args) {
	/*	int num;
		num = -5 + 3 * 10 / 2;				== 10
		System.out.println(num); */
		
	/*	int num = 10;
		System.out.println(num);	10
		System.out.println(num++);	10
		System.out.println(num);	11	
		System.out.println(--num);  10 */	
		
/*		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result);				false
		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result);				true
		System.out.println(!result);			false */
		
	/*	int num1 = 2;
		int num2 = 10;
		System.out.println(num1 & num2);		2
		System.out.println(num1 | num2);		10
		System.out.println(num1 ^ num2);		8
		System.out.println(~num1);				-3 */
		
	/*	int num = 8;
		
		System.out.println(num += 10);		18
		System.out.println(num -= 10);		8
		System.out.println(num >>= 2);		2		*/
				
		int num = 10;
		int num2 = 20;
		
		int result = (num >= 10) ? num2 + 10 : num2 - 10;
		System.out.println(result);		// 30
	}

}
