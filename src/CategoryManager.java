

public class CategoryManager {
	public void Add(Category category) {
		System.out.println(category.categoryName + " " + "eklendi");
	}
	
	public void Select(Category category) {
		System.out.println(category.categoryName + " " + "se�ildi");
	}
	
	public void Delete(Category category) {
		System.out.println(category.categoryName + " " + "silindi");
	}
	
	public void Update(Category category) {
		System.out.println(category.categoryName + " " + "g�ncellendi");
	}
}