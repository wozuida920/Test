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
	        
	        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
	       method.invoke(this.obj, args);
		  
		afterEat();
		return null;
	}
	private void  beforeEat(){
		System.out.println("吃猪脚前，先洗手！");
	}
	private void  afterEat(){
		System.out.println("吃猪脚后，也要洗手啊！");
	}

}
