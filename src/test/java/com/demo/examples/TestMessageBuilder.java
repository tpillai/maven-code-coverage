package com.demo.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testName() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello tejas", obj.getMessage("tejas"));

    }

   

}