package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	public AddPlace addPlacePayLoad(String name, String language, String address) {
		

		  AddPlace p = new AddPlace();
		   
		  p.setAccuracy(50);
		  p.setAddress(address);
		  p.setLanguage(language);
		  p.setName(name);
		  p.setPhone_number("(+91) 983 893 3937");
		  p.setWebsite("https://rahulshettyacademy.com");
		  //adding list using array list
		  List<String> mylist = new ArrayList<String>();
		  mylist.add("shoe park");
		  mylist.add("shop");
		  
		  p.setTypes(mylist);
		  //adding location values by object class
		  Location l = new Location();
		  l.setLat(-38.383494);
		  l.setLng(33.427362);
		  
		  p.setLocation(l);
		  return p;

	}
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n    \"place_id\":\""+placeId+"\"\r\n}";
	}
	
}
