package com.my.inner.test;
//import  com.my.inner.test.Outer02.Inner;
public class Test03 {
	public static void main(String[] args) {
		Outer02.Inner inner = new Outer02().new Inner();
		inner.info();
		
	}
}
  class Outer02{
	     public  void method(){
	     System.out.println("outer02----->");
	
	  
	     }
	     
	    class  Inner{
	    	public int num=10;
	    	public void info(){
	    		 System.out.println("inner----->");
	    	}
	    }

	}

