
public class StudentManager {
	
	public void coursesTakenByStudent(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + " adl? ??rencinin ald??? kurslar : ");
		for (String course : student.getCourseNames()) {
			System.out.println(course);
		}
		System.out.println("-------------------------------------");
	}
	
}