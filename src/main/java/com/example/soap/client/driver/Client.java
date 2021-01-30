package com.example.soap.client.driver;

import com.example.soap.client.service.*;

public class Client {

    public static void main(String[] args) {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorld port = service.getHelloWorldImplPort();
        String result = port.sayHelloWorld("World");
        System.out.println(result);
    }
}
