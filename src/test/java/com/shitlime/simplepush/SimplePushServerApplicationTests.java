package com.shitlime.simplepush;

import com.shitlime.simplepush.config.SendEmailProperties;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SimplePushServerApplicationTests {
	@Autowired
	SendEmailProperties sendEmailProperties;

	@Test
	void contextLoads() {
	}

	@Test
	void readProperties() {
		log.info("sendEmailProperties.cmd={}", sendEmailProperties.cmd);
	}

}
