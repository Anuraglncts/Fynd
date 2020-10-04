package TestCases;


import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;

import java.util.HashMap;

public class FyndTc 
{
	//@Test(priority = 1)
	public void GetRequest()
	{
		given()
	      
		.when()
		   .get("http://dummy.restapiexample.com/")
		   
		   .then() 
		      .statusCode(200)
		      .log().body();
	}
	
	@Test(priority = 2)
	public void postrequest()
	{
		HashMap data=new HashMap();
		
		data.put("name", "Anurag");
		data.put("salary","cityslicka");
		data.put("age","23");
		data.put("id","23");

   
		
		given()
		      .contentType("application/json")
		      .body(data)
		 
		  .when()
		   .post("http://dummy.restapiexample.com/create")
		   
		  .then()
		     .statusCode(200)
		     .log().body();
		     
	}
}

