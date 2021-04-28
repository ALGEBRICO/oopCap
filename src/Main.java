public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category(1,"Tümü");
		Category category2 = new Category(2,"Programlama");
		
		Category[] categories = {category1,category2};
		
		
		Course course1 = new Course(1,"Yazýlým Kampý","Mokoko");
		Course course2 = new Course(1,"Yazýlým Kampý","Mokoko");
		Course course3 = new Course(1,"Yazýlým Kampý","Mokoko");

		Course[] courses = {course1,course2,course3};
		
	
		Instructor instructor1 = new Instructor(1,"Engin Demiroð");
		Instructor instructor2 = new Instructor(2,"Mustafa Murat Coþkun");
		
		Instructor[] instructors = {instructor1};
		
		CourseManager courseManager = new CourseManager();
		courseManager.CourseAndInstructor(course3, instructor2);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.Add(instructor2);
	}

}