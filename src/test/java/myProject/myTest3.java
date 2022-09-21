package myProject;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.JsonObject;

public class myTest3 {

//	@DataProvider(name = "LoginData")
//	Object[][] willGiveData() {
//		Object[][] data = { { "atul", "atul@yahoo.com" }, { "dhani", "dhani@gmail.com" } };
//		return data;
//	}

	@DataProvider(name = "JsonLoginData")
	Object willGiveJsonData() throws IOException, ParseException {
		
		JSONObject senderObj= null;

		FileReader reader = new FileReader(".\\dataInfo.json");

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(reader);

		JSONObject jsonObj = (JSONObject) obj;
		// System.out.println(jsonObj.toString());

		Object [] objectArr = (Object[]) jsonObj.get("users");
		
	//	Object[] seobjectArrnderArr=(Object[])jsonArray;
		
		System.out.println(objectArr.getClass().getName().toString());
		
//		for (int i = 0, size = jsonArray.size(); i < size; i++) {
//		JSONObject objectInArray = (JSONObject) jsonArray.get(i);
//			System.out.println(objectInArray.toString());
//			System.out.println("***********/n");
//			senderObj=objectInArray;
//		}
		return objectArr;
	}

//	@Test(dataProvider = "LoginData")
//	public void useData(String name, String email) {
//
//		System.out.println(name + "    " + email);
//	}

	@Test(dataProvider = "JsonLoginData")
	public void useJsonData(String firstName, String lastName, float phoneNumber, String emailAddress) {

		System.out.println(firstName + "    " + lastName + "    " + phoneNumber + "    " + emailAddress);

	}

}
