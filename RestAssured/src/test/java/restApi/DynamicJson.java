package restApi;

import static io.restassured.RestAssured.given;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import restApi.payload;
import restApi.ReUsableMethods;

public class DynamicJson {
	@Test(dataProvider ="booksdata")

	public void addBook()

	{
		RestAssured.baseURI = "http://216.10.245.166";
		String Response = given().header("Content-Type","application/json")
		.body(payload.addBook()).
		when()
		.post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract()
		.response().asString();
	
		JsonPath js= ReUsableMethods.rawToJson(Response);

	String id =	js.get("ID");
	
	System.out.println(id);
	}
	
	/*@DataProvider(name ="booksdata")
	
	public Object[][] getdata(){

        //array=collection of elements

     //multidimensional array= collection of arrays
		
		  return new Object[][] {‌{"ojfwty","9363"},{"cwetee","4253"},{"okmfet","533"}};
		
	}	*/	
}
