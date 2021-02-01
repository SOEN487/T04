package com.example.soap.service;

import com.example.soap.utils.StudentData;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Interface for our HelloWorld web service
 */
@WebService
public interface HelloWorld {
    @WebMethod
    String sayHelloWorld(String content);
    @WebMethod
    StudentData getStudent(String first_name);
}
