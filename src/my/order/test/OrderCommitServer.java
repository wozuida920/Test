package my.order.test;

import java.util.Random;

public class OrderCommitServer {
private  static int money;
public static void main(String args[]){
	for(int i=0;i<4;i++){
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			synchronized (OrderCommitServer.class) {//1��synchronized (this):û����ס�� 2��synchronized (OrderCommitServer.class) ����  Ч�ʷǳ�����
				//
				money = new Random().nextInt(10000);
				System.out.println("��ǰ�Ĵ����߳��ǣ�"+Thread.currentThread().getName()+
						"��̨��ʾ���������---->"+money);
				new A_model().getMoney();
				new B_model().getMoney();
			}
			// TODO Auto-generated method stub
			
		}
	}).start();
	}//for
}
static class  A_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"����ģ��A������ϣ���ǰ�����--->"+money);
	}
}
static class  B_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"����ģ��B������ϣ���ǰ�����--->"+money);
	}
}
}
