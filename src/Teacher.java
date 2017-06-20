public class Teacher extends Person {
	private String name = "tom";

	public Teacher() {
		super();
		System.out.println("this is a teacher");

	}

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		System.out.println(teacher.name);
	}
}