package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person PersonKim = new Person();
		PersonKim.name = "김유신";
		PersonKim.height = 180f;
		PersonKim.weight = 85.5f;
		
		Person PersonLee = new Person("이순신" , 175, 75);
		
		System.out.println(PersonKim);
		System.out.println(PersonLee);
	}

}
