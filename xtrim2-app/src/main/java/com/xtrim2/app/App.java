package com.xtrim2.app;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.LocalTime;

/**
 * Hello Universe!
 *
 */
public class App {
    public static void main(String[] args) {
        com.xtrim.app.greet.Greeter greeter = new com.xtrim.app.greet.Greeter();
        System.out.println(greeter.sayHelloWorld());
        com.xtrim2.app.greet.Greeter greeter2 = new com.xtrim2.app.greet.Greeter();
        System.out.println(greeter2.sayHelloUniverse());
        // System.out.println("Hello Universe!");
        System.out.println(StringUtils.capitalize("hello universe"));
        System.out.println("The current local time is: " + new LocalTime());
    }
}
