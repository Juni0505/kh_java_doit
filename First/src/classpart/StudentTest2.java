package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		Student student1 = new Student(3);
		student1.studentName = "안연수";
		
		Student student2 = new Student(2);
		student2.studentName = "안승연";
		
		System.out.println(student1);
		System.out.println(student2);

	}

}
