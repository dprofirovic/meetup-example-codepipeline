package com.example.lambda.api;

/**
 * Response is also a POJO that will handle return and
 * Lambda runtime automatically serializes it to JSON. Again see the documentation.
 *
 * @link http://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-pojo.html
 */
public class Response {

    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}