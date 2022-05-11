package com.sattrix.service;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * In this class we have define methods and properties which we are using to store data from 
 * the api and return it when it requires
 * @author jitendra singh
 *
 */
@XmlRootElement
public class Result {

	String value;
	String message;
	boolean success;
	int responseCode;

	public Result() {
	}

	public Result(String value, String message, boolean success, int responseCode) {
		this.value = value;
		this.message = message;
		this.success = success;
		this.responseCode = responseCode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

}
