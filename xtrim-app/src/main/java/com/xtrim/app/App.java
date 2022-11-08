package com.xtrim.app;

import java.util.logging.Level;
import java.util.logging.Logger;

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

        // Access Property from properties File
        com.xtrim.app.util.ApplicationProperties properties = new com.xtrim.app.util.ApplicationProperties();
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("PORT"));
        com.xtrimutil.app.util.ApplicationProperties properties2a = new com.xtrimutil.app.util.ApplicationProperties();
        Logger.getLogger("App Main").log(Level.INFO,
                properties2a.readProperty("PORT"));
        com.xtrimutil.app.util.ApplicationProperties properties2b = new com.xtrimutil.app.util.ApplicationProperties();
        Logger.getLogger("App Main").log(Level.INFO,
                properties2b.readProperty("PORT2"));
    }
}
