package com.lotte.myapp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lotte.dto.SampleDTO;

public class LombokTest {
	private static final Logger Logger = LoggerFactory.getLogger(LombokTest.class);
	
	
	@Test
	public void testLombok() {
		SampleDTO dto = new SampleDTO();
		dto.setName("╠Х╠Беб");
		dto.setAge(38);
		dto.setIq(89.2);
		
		Logger.info(dto.toString());
		
	}

}

