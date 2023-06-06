package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
	//	studentLee.studentName = "이상원";	private 으로 인해 오류발생
		studentLee.setStudentname("이상원");
		
		System.out.println(studentLee.getStudentName());
	}

}
