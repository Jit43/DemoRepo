package com.sattrix.apiconsume;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.sattrix.service.Result;
import com.sattrix.service.Services;

/**
 * In this class we have define our api which include the get method when the user request for 
 * the get method with the help of the following path it will provide the values which are stored in the another api 
 * and display that in json format to the user
 * @author jitendra singh
 *
 */
@Path("/getdata")
public class Resource {
	
	Services service=new Services();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Result getData() throws JsonParseException, JsonMappingException, MalformedURLException, IOException
	{
		Result response=new Result();
		response=service.fetchData();
		
		return response;
	}
	
}
