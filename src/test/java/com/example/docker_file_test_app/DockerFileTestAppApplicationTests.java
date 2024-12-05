package com.example.docker_file_test_app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DockerFileTestAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	@DisplayName("dummy test")
	void dummyTest() {
		assertThat(true).isTrue();
	}

}
