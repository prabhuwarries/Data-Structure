package frameworkCreateRelatedQes;

import java.util.Properties;

public class ReadDataFromPropertiesFile {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            // Load the properties file from the classpath
            prop.load(ReadDataFromPropertiesFile.class.getClassLoader().getResourceAsStream("config.properties"));

            // Read properties
            String url = prop.getProperty("url");
            String username = prop.getProperty("username");
            String password = prop.getProperty("password");

            // Print the properties
            System.out.println("URL: " + url);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
