package com.test.java.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itexico.weblayer.Application;
import com.itexico.weblayer.controller.HomeController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class SmokeTest {

	@Autowired
	private HomeController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
