package com.jinghang.test;

/*
 * ���ߣ�֪���û�
 
���ӣ�https://www.zhihu.com/question/52737386/answer/131835009
��Դ��֪��
����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
*/
public class MainSubTest {

	public static void main(String[] args) throws InterruptedException {
		final Business business = new Business();
		// ���߳�
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
                            for (int i = 0; i < 50; i++) {
                                try {
                                     business.sonBusiness(i);
                                } catch (InterruptedException e) {
                                }
                            }
			}
		});
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    try {
                        business.mainBusiness(i);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();
	}

}

class Business {
    private int pos = 1;

	public void mainBusiness(int i) throws InterruptedException {
        synchronized (this) {
            while (pos != 2) {
                this.wait();
            }
        }
        for (int j = 1; j <= 20; j++) {
            System.out.println("���̵߳�" + i + "�֣���" + j + "��");
        }
        synchronized (this) {
            pos = 1;
            this.notify();
        }
	}

	public void sonBusiness(int i) throws InterruptedException {
        synchronized (this) {
            while (pos != 1) {
                this.wait();
            }
        }
        for (int j = 1; j <= 30; j++) {
            System.err.println("���̵߳�" + i + "�֣���" + j + "��");
        }
        synchronized (this) {
            pos = 2;
            this.notify();
        }
	}
}
