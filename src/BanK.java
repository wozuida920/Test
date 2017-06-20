
public class BanK {
private int account;

public int getAccount() {
	return account;
}


public void setAccount(int account) {
	this.account = account;
}


public   void saveAccount(int i) {
	this.account = account+i;
}
public static void main(String args[]){
	final BanK banK = new BanK();
	banK.setAccount(100);
	
for( int i=0;i<10;i++)
{
 new Thread( new Runnable() {
		
		
		@Override
		public void run() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			banK.saveAccount(1);
			System.out.println(">>>"+banK.getAccount());
			
		}
	}).start();
	//r.run();
}

System.out.println(banK.getAccount());
	
}
}
