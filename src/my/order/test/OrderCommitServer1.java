package my.order.test;



import java.util.Random;
/*
 * 
 * �̸߳�������
 */
public class OrderCommitServer1 {
private  static ThreadLocal<Integer> o = new ThreadLocal<Integer>();
public static void main(String args[]){
	for(int i=0;i<4;i++){
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			
				//
				o.set(new Random().nextInt(10000));
				System.out.println("��ǰ�Ĵ����߳��ǣ�"+Thread.currentThread().getName()+
						"��̨��ʾ���������---->"+o.get());
				new A_model().getMoney();
				new B_model().getMoney();
			}
			// TODO Auto-generated method stub
			
		
	}).start();
	}//for
}
static class  A_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"����ģ��A������ϣ���ǰ�����--->"+o.get());
	}
}
static class  B_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"����ģ��B������ϣ���ǰ�����--->"+o.get());
	}
}
}
