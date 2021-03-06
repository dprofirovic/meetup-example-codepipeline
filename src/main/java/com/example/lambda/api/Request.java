package com.example.lambda.api;

/**
 * Request class is a POJO. You should modify this class according to your needs.
 * <p>
 * Event json that lambda function will automatically serialize to this POJO.
 * For more details see Lambda documentation:
 *
 * @link http://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-pojo.html
 */
public class Request {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}

