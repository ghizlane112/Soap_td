package org.example.server;

import jakarta.xml.ws.Endpoint;
import org.example.webservice.ProductWebService;

public class ServerWs {
     public static void main(String[] args) {
         String url = "http://localhost:8088/";

         Endpoint.publish(url,new ProductWebService());
         System.out.println(url+" deployed");
    }
}
