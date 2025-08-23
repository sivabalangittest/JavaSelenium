package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GetAPI {
	
	@Test
	public void GetAPIRequestResponse() {
		
		Response getResponse = get("https://reqres.in/api/users?page=2");
		System.out.println(getResponse.statusCode());
		System.out.println(getResponse.getBody().asString());
		
		Assert.assertEquals(getResponse.statusCode(), 401);
	}
	
	@Test
	public void GetAPIGivenThen() {
		
		given().
			get("https://reqres.in/api/users?page=2").
		then().
			statusCode(200).
			body("data[0].id",equalTo(7)).
			body("data[4].first_name", equalTo("George"));
			
			
	}
}
