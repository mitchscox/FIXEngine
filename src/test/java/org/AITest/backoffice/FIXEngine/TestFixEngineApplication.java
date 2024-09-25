package org.AITest.backoffice.FIXEngine;

import org.springframework.boot.SpringApplication;

public class TestFixEngineApplication {

	public static void main(String[] args) {
		SpringApplication.from(FixEngineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
