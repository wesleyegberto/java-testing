package com.github.wesleyegberto.restassuredtest;

import org.junit.jupiter.api.Test;

// Common imports
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class PingResourceIT {

	@Test
	public void shouldReturnAMessage() {
		when()
			.get("http://localhost:8080/rest-assured-test/resources/messages")
		.then()
			.contentType("application/json").and()
			.body("message", equalTo("Hello Rest Assured!"));
	}
}
