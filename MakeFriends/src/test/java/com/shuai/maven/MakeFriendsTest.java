package com.shuai.maven;

import org.junit.Assert;
import org.junit.Test;

/**
 * MakeFriendsTest
 *
 * @author shuai
 * @date 2018/11/26
 */
public class MakeFriendsTest {

	@Test
	public void testMakeFriends(){
		MakeFriends makeFriends = new MakeFriends();
		String str = makeFriends.makeFriends("litingwei");
		Assert.assertEquals("Hey,John make a friend please.",str);
	}
}
