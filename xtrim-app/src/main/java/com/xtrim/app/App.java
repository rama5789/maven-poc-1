package com.xtrim.app;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalTime;

import com.xtrim.app.greet.Greeter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHelloWorld());
        // System.out.println("Hello World!");
        System.out.println(StringUtils.capitalize("hello world"));
        System.out.println("The current local time is: " + new LocalTime());
    }
}
