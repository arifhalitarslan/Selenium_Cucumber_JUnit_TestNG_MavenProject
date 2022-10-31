package com.project.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties getPropertyObject() throws IOException {

        FileInputStream fp = new FileInputStream("configuration.properties");

        Properties properties = new Properties();

        properties.load(fp);

        return properties;


    }


}
