package com.example.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsdemoApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(JenkinsdemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("FIrst log exececuted");
		assertEquals(true,true);
	

}
