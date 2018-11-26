package com.shuai.maven;

import javax.lang.model.element.VariableElement;

/**
 * MakeFriends
 *
 * @author shuai
 * @date 2018/11/26
 */
public class MakeFriends {
	public String makeFriends(String name){
		HelloFriend friend = new HelloFriend();
		friend.sayHelloToFrind("litingwei");
		String str = "Hey,"+friend.getMyName()+" make a friend please.";
		System.out.println(str);
		return str;
	}

}
