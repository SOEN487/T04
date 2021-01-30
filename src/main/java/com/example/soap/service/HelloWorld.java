package com.example.soap.service;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Interface for our HelloWorld web service
 */
@WebService
@SOAPBinding
public interface HelloWorld {
    @WebMethod
    String sayHelloWorld(String content);
}
