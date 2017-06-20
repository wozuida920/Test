import java.util.HashMap;
import java.util.Map;
/*

内部类测试 by wangxifeng
*/

public class Test {
	private void testfunc1(Student student){
		student.name="赵王";
		student.studentNo="9999";
	}
private  void testfunc(String name){
	name="123";
	System.out.println("name in Function--->"+name);
}
public static void main(String[] args) {
//	Map<String, String> pMap = new HashMap<String, String>();
	Test test = new Test();
	String name = "456";
	test.testfunc(name);
	
	System.out.println("name in main--->"+name);
	Student student =new Test.Student("8888", "嬴稷");
	test.testfunc1(student);
	System.out.println(student.studentNo);
	System.out.println(student.name);
	
	
}
 static class Student{
	String studentNo,name;

	 Student(String studentNo, String name) {
		super();
		this.studentNo = studentNo;
		this.name = name;
	}
	
}
}
