package com.shuai.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * HelloTest
 *
 * @author shuai
 * @date 2018/11/26
 */
public class HelloTest {

	@Test
	public void testHello(){
		Hello hello = new Hello();
		String result = hello.sayHello("litingwei");
		Assert.assertEquals("Hello litingwei!",result);
	}
}
