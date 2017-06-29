package com.example.lambda.domain;

import java.util.HashMap;

public class Application {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String response = "Echoing message: " + value;
        return response;
    }
}
