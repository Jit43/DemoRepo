package com.sattrix.service;

import java.io.IOException;
import java.net.MalformedURLException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.JSONObject;

/**
 * In this class we have define the service method for the Calling of get method when get method will called 
 * this function will called to fetch the data from the api and give store the required value in the object 
 * of Result class and return it from the place it is called
 * @author jitendra singh
 *
 */
public class Services {

	public Result fetchData() throws JsonParseException, JsonMappingException, MalformedURLException, IOException {

		Client client = ClientBuilder.newClient();

		String data;
		data= client.target(
				"https://1lzur2qul1.execute-api.us-east-2.amazonaws.com/prod/getLatestTransactions?skip=0&limit=1")
				.request(MediaType.APPLICATION_JSON).get(String.class);

		JSONObject obj = new JSONObject(data);
		JSONObject arr = obj.getJSONArray("responseData").getJSONObject(0);
		Result result = new Result(arr.getString("value"), obj.getString("message"), obj.getBoolean("success"),
				obj.getInt("responseCode"));

		return result;
	}

}
