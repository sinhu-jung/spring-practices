package com.douzone.container.config.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.container.user.User1;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes= {AppConfig01.class})
@ContextConfiguration(locations= {"/com/douzone/container/config/user/applicationContext01.xml"})
public class XmlConfigTest {
	@Autowired
	private User1 user1;
	
	@Test
	public void testUserNotNull() {
		assertNotNull(user1);
	}
}
