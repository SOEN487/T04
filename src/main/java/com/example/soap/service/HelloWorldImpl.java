package com.example.soap.service;
import javax.jws.WebService;

/**
 * This class holds the implementation of the methods of our SOAP web service
 */
@WebService(endpointInterface = "com.example.soap.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	/**
	 * Prints a simple message with input from the client.
	 * @param content
	 * @return
	 */
	@Override
	public String sayHelloWorld(String content) {
		return "Hello " + content + "!";
	}
}