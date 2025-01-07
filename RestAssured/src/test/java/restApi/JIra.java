package restApi;

import static io.restassured.RestAssured.*;



import java.io.File;



import org.testng.Assert;



import io.restassured.RestAssured;

import io.restassured.filter.session.SessionFilter;

import io.restassured.path.json.JsonPath;


public class JIra {

	public static void main (String[]args) {
		
 RestAssured.baseURI ="http://localhost:8080"; 
	 
 //login to jira 
 
    SessionFilter Session = new SessionFilter();  
    
		given().relaxedHTTPSValidation().header("Content-Type","application/json")
		.body("{\r\n" + "\"username\" : \"saitejaera\",\r\n" + "  \"password\": \"Gixxer@123\"\r\n" + "}").log().all()
		.when().post("/rest/auth/1/session")
		.then().log().all().extract().response().asString();
		
 //Add comment 
		String expectedMessage ="hi how are you?";
		
		String addCommentResponse =given().pathParam("key", "10101").log().all().header("Content-Type","application/json")
		.body("{\r\n" +"    \"body\": \""+expectedMessage+"\",\r\n" +"    \"visibility\": {\r\n" +
    "  \"type\": \"role\",\r\n" +"  \"value\": \"Administrators\"\r\n" +"    }\r\n" +"}")
		.filter(Session).when().post("/rest/api/2/issue/{key}/comment")
		.then().log().all()
		.assertThat().statusCode(201).extract().response().asString();	
		
		JsonPath js = new JsonPath(addCommentResponse);
		String commentId = js.getString("id");
		
		//Add Atachment
		
		given().header("X-Atlassian-Token","no-check").filter(Session).pathParam("key", "10101")
		.header("Content-Type","multipart/form-data").multiPart("file",new File("jira.txt"))
		.when().post("rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
		
		
          //GetIssue
		
		String issueDeatils = given().filter(Session).pathParam("key", "10101").queryParam("fields","comment")	.log().all()
				.when().get("/rest/api/2/issue/{key}").then().log().all().extract().response().asString();
		
		
		System.out.println(issueDeatils);
		
		JsonPath js1 = new JsonPath(issueDeatils);
		
		int commentsCount = js1.getInt("fields.comment.comments.size()");
		
		for(int i=0;i<commentsCount;i++) {
			
			String commentIdIssue =js1.get("fields.comment.comments["+i+"].id").toString();
			
			if(commentIdIssue.equalsIgnoreCase(commentId))
			{
				String message = js1.get("fields.comment.comments["+i+"].body").toString();
				
				System.out.println(message);
				
				Assert.assertEquals(message, expectedMessage);
			}
			
			
			
		}
		
	}

}
