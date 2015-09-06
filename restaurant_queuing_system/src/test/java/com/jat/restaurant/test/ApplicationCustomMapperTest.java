package com.jat.restaurant.test;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.restaurant.dao.UserMapper;
import com.restaurant.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:conf/applicationContext-persist.xml"})
public class ApplicationCustomMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void addUser(){
		User user = new User();
		user.setUserName("陈春杰");
		user.setAge(23);
		user.setCreateTime(new Date(System.currentTimeMillis()));
		user.setPhone("15088132300");
		user.setPwd("123456");
		user.setEmail("919700667@qq.com");
		int i = userMapper.insert(user);
		System.out.println(i);
	}
	
/*	@Test
	public void getAppsBySpaceTypeTest(){
		List<Application> apps = mapper.getAppsBySpaceType(7001);
		Assert.assertEquals(3, apps.size());
		for(Application app: apps){
			System.out.println(app);
		}
	}
*/	
/*	@Test
	public void getAppsByCategoryIdTest(){
		List<Application> apps = mapper.getAppsByCategoryId(2);
		Assert.assertEquals(3, apps.size());
	}
*/
	
}
