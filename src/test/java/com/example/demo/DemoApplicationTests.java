package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class DemoApplicationTests {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void hello_ok() throws Exception {
		ResponseEntity<String> response = template.getForEntity("/api/hello", String.class);
		assertThat(response.getBody()).isEqualTo("Hi! Hello World!");
	}
}
