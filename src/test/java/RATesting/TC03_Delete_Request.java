package RATesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC03_Delete_Request {
	@Test
	 void DeleteRequestResponse()
	 {
	  
	  //Specify base URI
	  RestAssured.baseURI="https://reqres.in/";
	  //Request object
	///  RequestSpecification httpRequest=RestAssured.given();
	  
	  //Response object
	  Response response=null;
	  
	  response = RestAssured.given()
              .contentType(ContentType.JSON)
              .delete("/api/users/2");
	  
	  //status code validation
	  int statusCode=response.getStatusCode();
	  System.out.println("Status code is: "+statusCode);
	  Assert.assertEquals(statusCode, 204);
	  
	    //print response in console window
	  
		//  String responseBody=response.getBody().asString();
		//  System.out.println("Response Body is:" +responseBody);
	  
}
}