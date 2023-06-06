package String;

public class WrapperTest {

	public static void main(String[] args) {
		Integer iValue = new Integer(100);
		int myValue = iValue.intValue();
		
		System.out.println(myValue);
		
		Integer number1 = Integer.valueOf("200");
		Integer number2 = Integer.valueOf(300);
		
		int num = Integer.parseInt("400");
		
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(num);
	}

}
