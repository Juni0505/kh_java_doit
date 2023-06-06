package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student(5);
		studentAhn.studentName = "안연수";
	
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());

	}
}	
	

