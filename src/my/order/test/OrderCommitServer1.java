package my.order.test;



import java.util.Random;
/*
 * 
 * 线程副本变量
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
				System.out.println("当前的处理线程是："+Thread.currentThread().getName()+
						"后台显示订单金额是---->"+o.get());
				new A_model().getMoney();
				new B_model().getMoney();
			}
			// TODO Auto-generated method stub
			
		
	}).start();
	}//for
}
static class  A_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"进入模块A处理完毕，当前金额是--->"+o.get());
	}
}
static class  B_model{
	public void getMoney(){
		System.out.println(Thread.currentThread().getName()+"进入模块B处理完毕，当前金额是--->"+o.get());
	}
}
}
