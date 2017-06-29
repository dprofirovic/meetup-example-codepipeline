package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.example.lambda.api.Request;
import com.example.lambda.api.Response;
import com.example.lambda.domain.Application;

/**
 * Entry point for AWS lambda functions
 */
public class LambdaHandler {

    protected boolean initialized;

    private Application application = new Application();

    /**
     * The main entry point of the lambda
     */
    public Response execute(Request request, Context context) {

        application.setValue(request.getMessage());

        return new Response(application.toString());
    }
}