package com.sattrix.apiconsume;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * This class is used to define the application path of our api
 * @author jitendra singh
 *
 */
@ApplicationPath("/restapi")
public class RestEasyService extends Application  {

	
	    private Set < Object > singletons = new HashSet < Object > ();

	    public RestEasyService() {
	        singletons.add(new Resource());
	    }

	    @Override
	    public Set < Object > getSingletons() {
	        return singletons;
	    }
	    
	}

