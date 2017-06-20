package com.my.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler{
	
private Object obj;


public  MyHandler(Object object){
	this.obj = object;
}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		beforeEat();
		  System.out.println("Method:" + method);
	        
	        //    ��������������ʵ����ķ���ʱ������Զ�����ת��������������handler�����invoke���������е���
	       method.invoke(this.obj, args);
		  
		afterEat();
		return null;
	}
	private void  beforeEat(){
		System.out.println("�����ǰ����ϴ�֣�");
	}
	private void  afterEat(){
		System.out.println("����ź�ҲҪϴ�ְ���");
	}

}
