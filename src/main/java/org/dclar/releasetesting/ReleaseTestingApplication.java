package org.dclar.releasetesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReleaseTestingApplication {

	public static void main(String[] args) {

		// upgrade
		SpringApplication.run(ReleaseTestingApplication.class, args);
	}

}
