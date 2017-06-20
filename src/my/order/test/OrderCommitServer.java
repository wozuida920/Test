package my.order.test;

import java.util.Random;

public class OrderCommitServer {
private  static int money;
public static void main(String args[]){
	for(int i=0;i<4;i++){
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			synchronized (OrderCommitServer.class) {//1、synchronized (this):没有锁住； 2、synchronized (OrderCommitServer.class) 重锁  效率非常低下
				//
				money = new Random().nextInt(10000);
				System.out.println("当前的处理线程是："+Thread.currentThread().getName()+
						"后台显示订单金额是---->"+money);
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
		System.out.println(Thread.currentThread().getName()+"进入模块A处理完毕，当前金额是--->"+money);
	}
}
static class  B_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"进入模块B处理完毕，当前金额是--->"+money);
	}
}
}
