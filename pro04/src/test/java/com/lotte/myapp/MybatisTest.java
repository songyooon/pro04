package com.lotte.myapp;

import static org.junit.Assert.fail;

import org.codehaus.plexus.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lotte.myapp.mapper.TimeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/root-context.xml")
public class MybatisTest {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TimeMapper timeMapper;
	

	@Test
	public void mybatisTest() {
		logger.info(timeMapper.getClass().getName());
		logger.info(timeMapper.getTime1());
		//fail("Not yet implemented");
	}

}
