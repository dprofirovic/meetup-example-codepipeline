package com.example.lambda.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest {
    Application application;

    @Before
    public void setup(){
        application = new Application();
    }

    @Test
    public void testApplicationWhenMessageProvided_ShouldEchoMessage() {
        String message = "ABC";
        application.setValue(message);
        Assert.assertNotNull(application.toString());
        Assert.assertTrue(application.toString().contains(message));
    }
}
