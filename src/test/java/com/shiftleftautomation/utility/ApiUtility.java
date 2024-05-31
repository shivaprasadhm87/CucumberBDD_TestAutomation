package com.shiftleftautomation.utility;

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

    // Reusable methods for different request types
    public void get() {
        sendRequest(Method.GET);
    }

    public void post() {
        sendRequest(Method.POST);
    }

    public void put() {
        sendRequest(Method.PUT);
    }

    public void delete() {
        sendRequest(Method.DELETE);
    }

    // Private method to send the request
    private void sendRequest(Method method) {
        response = given()
                .baseUri(baseUri)
//                .headers(headers)
//                .body(body)
                .when()
                .request(method, endpoint);
        System.out.println(response);
    }

    // Method to get the response
    public Response getResponse() {
        return response;
    }
}
