
package com.example.soap.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.client.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayHelloWorld_QNAME = new QName("http://service.soap.example.com/", "sayHelloWorld");
    private final static QName _SayHelloWorldResponse_QNAME = new QName("http://service.soap.example.com/", "sayHelloWorldResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloWorldResponse }
     * 
     */
    public SayHelloWorldResponse createSayHelloWorldResponse() {
        return new SayHelloWorldResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorld }
     * 
     */
    public SayHelloWorld createSayHelloWorld() {
        return new SayHelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "sayHelloWorld")
    public JAXBElement<SayHelloWorld> createSayHelloWorld(SayHelloWorld value) {
        return new JAXBElement<SayHelloWorld>(_SayHelloWorld_QNAME, SayHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "sayHelloWorldResponse")
    public JAXBElement<SayHelloWorldResponse> createSayHelloWorldResponse(SayHelloWorldResponse value) {
        return new JAXBElement<SayHelloWorldResponse>(_SayHelloWorldResponse_QNAME, SayHelloWorldResponse.class, null, value);
    }

}
