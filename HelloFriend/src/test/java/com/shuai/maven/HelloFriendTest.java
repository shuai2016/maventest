package com.shuai.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * HelloFriendTest
 *
 * @author shuai
 * @date 2018/11/26
 */
public class HelloFriendTest {

	@Test
	public void testHelloFriend(){
		HelloFriend helloFriend = new HelloFriend();
		String result = helloFriend.sayHelloToFrind("litingwei");
		Assert.assertEquals("Hello litingwei! I am John",result);
	}
}
