public class CourseManager {
	public void Add(Course course) {
		System.out.println(course.courseName + " " + "eklendi");
	}
	
	public void CourseAndInstructor(Course course,Instructor instructor) {
		System.out.println(course.courseName +" kursu" + " " + instructor.firstName +"isimli eðitmene aittir");
	}

}