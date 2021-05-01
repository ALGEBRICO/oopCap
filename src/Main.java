public class Main {

	public static void main(String[] args) {
		
		Student user1 = new Student();
		user1.setId(1);
		user1.setRole("Student");
		user1.setFirstName("Vahip");
		user1.setLastName("Şimşek");
		user1.setEmail("vahip@vahip.com");
		user1.setMajor("Manager");
		user1.setNumberofCoursesTaken(2);
		String [] coursesTakenByUser1 = {"Java", "C"};
		user1.setCourseNames(coursesTakenByUser1);
	
	
		Instructor user2 = new Instructor();
		user2.setId(2);
		user2.setRole("Instructor");
		user2.setFirstName("Engin");
		user2.setLastName("Demiroğ");
		user2.setEmail("engindemirog@gmail.com");
		String [] certificates = {"Java","Python","C","C#"};
		user2.setCertificates(certificates);
		user2.setNumberofCoursesGiven(2);
		String [] coursesGivenByUser2 = {"Java", "C"};
		user2.setCourseNames(coursesGivenByUser2);
	
	
	UserManager userManager = new UserManager();
	
	User [] users = {user1,user2};
	
	userManager.addMultipleUser(users);
    
	StudentManager studentManager = new StudentManager();
	studentManager.coursesTakenByStudent(user1);
	
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.coursesGivenByInstructor(user2);
	}

}