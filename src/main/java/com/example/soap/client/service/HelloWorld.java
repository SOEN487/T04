
package com.example.soap.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://service.soap.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.example.soap.client.service.StudentData
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudent", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.GetStudent")
    @ResponseWrapper(localName = "getStudentResponse", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.GetStudentResponse")
    @Action(input = "http://service.soap.example.com/HelloWorld/getStudentRequest", output = "http://service.soap.example.com/HelloWorld/getStudentResponse")
    public StudentData getStudent(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.SayHelloWorldResponse")
    @Action(input = "http://service.soap.example.com/HelloWorld/sayHelloWorldRequest", output = "http://service.soap.example.com/HelloWorld/sayHelloWorldResponse")
    public String sayHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
