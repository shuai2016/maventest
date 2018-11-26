package com.shuai.maven;

/**
 * HelloFriend
 *
 * @author shuai
 * @date 2018/11/26
 */
public class HelloFriend {
	public String sayHelloToFrind(String name){
		Hello hello = new Hello();
		String str = hello.sayHello(name)+" I am "+ this.getMyName();
		System.out.println(str);
		return str;
	}
	public String getMyName(){
		return "John";
	}
}
