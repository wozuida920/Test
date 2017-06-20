package com.my.dynamic.proxy;

import java.lang.reflect.Proxy;

public class Test {
public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	People stuPeople = new Student();
	MyHandler h = new MyHandler(stuPeople);
	// = new Student();
     People people  = (People)Proxy.newProxyInstance(People.class.getClassLoader(), new Class[]{People.class}, h);
     people.eat();
   System.out.println("<<<<<<------------------------------------------------------------------------->>>>>>");  
     people.sleep();
}
}
