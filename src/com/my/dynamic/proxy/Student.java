package com.my.dynamic.proxy;

public class Student implements People {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
       System.out.println("我是学生，我喜欢吃猪脚！");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		 System.out.println("我是学生，我喜欢睡觉！");
	}

}
