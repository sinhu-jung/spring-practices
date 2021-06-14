package com.douzone.container.config.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.container.user.User;

public class AppConfigTest {
	//Java Config
	//직접 설정 자바 클래스를 전달
	//설정 클래스에 @Configuration이 필요없다.
	@Test
	public void testAppConfig01() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig02.class);
		User user = ac.getBean(User.class);
		assertNotNull(user);	
	}
	
	@Test
	public void testAppConfig02() {
		ApplicationContext ac = new AnnotationConfigApplicationContext("com.douzone.container.config.user");
		User user = ac.getBean(User.class);
		assertNotNull(user);
	}
}
