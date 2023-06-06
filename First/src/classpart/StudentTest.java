package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student(5);
		studentAhn.studentName = "안승연";
	
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}

}
