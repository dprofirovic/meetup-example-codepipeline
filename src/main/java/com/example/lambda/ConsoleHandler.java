package com.example.lambda;

import com.example.lambda.domain.Application;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Entry point from Console
 */
public class ConsoleHandler {
    private static Application application = new Application();

    public static void main(String[] args) throws IOException {

        System.out.println("Message to echo?");
        Scanner in = new Scanner(System.in, StandardCharsets.UTF_8.name());
        String message = in.next();

        application.setValue(message);

        System.out.println(application.toString());
    }
}
