package com.shiftleftautomation.api.utility;

import io.restassured.http.Method;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiUtility {

    private String baseUri;
    private String endpoint;
    private Map<String, String> headers;
    private Object body;
    private Response response;

    // Setters
    public void setBaseUri(String baseUri) {
        this.baseUri = baseUri;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void sendRequest(String httpMethod, String contentType, String requestBody) {
        response = given()
                .baseUri(baseUri)
              .headers("Content-type",contentType)
               .body(requestBody)
                .when()
                .request(httpMethod, endpoint);
        }
    
//    public void sendRequest(String httpMethod) {
//        response = given()
//                .baseUri(baseUri)
//                .when()
//                .request(httpMethod, endpoint);
//        }
   

    // Method to get the response
    public Response getResponse() {
        return response;
    }
}
