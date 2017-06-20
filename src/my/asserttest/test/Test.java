package my.asserttest.test;

public class Test {
	
	
	public void test1(){
		throw new RuntimeException("13334444");
	}
	
	
	//public static void main(String[] args)
	public static void main(String[] args){
//		   boolean isOk = 1>2;
//		   assert isOk;
//		   System.out.println("程序正常");   
		
		try {
			new Test().test1();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 System.out.println("程序正常");   
		}
}
