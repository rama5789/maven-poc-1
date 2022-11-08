package com.xtrimutil.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.xtrimutil.app.util.ApplicationProperties;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Access Property from properties File
        ApplicationProperties properties = new ApplicationProperties();
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("PORT"));
        Logger.getLogger("App Main").log(Level.INFO, properties.readProperty("PORT2"));
    }
}
