public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println(instructor.instructorName +"-"+ "eklendi");
	}
	
	public void Delete(Instructor instructor) {
		System.out.println(instructor.instructorName +"-"+ "silindi");
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.instructorName +"-"+ "güncellendi");
	}
}