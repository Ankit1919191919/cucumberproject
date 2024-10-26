package com.qascript.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static Properties properties = new Properties();
    public static FileInputStream fis;

   public  static Properties loadapplicationproperties(){

       try {
           fis = new FileInputStream("application.properties");
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }


       try {
           properties.load(fis);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

       return properties;

   }


    public static Properties loadframeworkproperties(){


        try {
            fis = new FileInputStream("framework.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;


    }

    public static Properties loaduserproperties(){


        try {
            fis = new FileInputStream("user.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;


    }

}
