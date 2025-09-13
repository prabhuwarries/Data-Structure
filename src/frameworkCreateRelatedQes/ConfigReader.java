package frameworkCreateRelatedQes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    public static void loadConfig(String fileName) throws IOException {
        properties = new Properties();
        String filePath = "src/frameworkCreateRelatedQes/" + fileName; // Adjust the path as needed
        FileInputStream fis = new FileInputStream(filePath);
        properties.load(fis);
        fis.close();
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        loadConfig("config.properties");
        String url = get("url");
        String username = get("username");
        String password = get("password");

        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
