package frameworkCreateRelatedQes;

public class SingletonWebDriver {
    private static SingletonWebDriver instance;
    private final String driver;

    private SingletonWebDriver() {
        // Private constructor to prevent instantiation
        this.driver = "WebDriver Instance";
    }

    public static SingletonWebDriver getInstance() {
        if (instance == null) {
            instance = new SingletonWebDriver();
        }
        return instance;
    }

    public String getDriver() {
        return driver;
    }

    public static void main(String[] args) {
        SingletonWebDriver driver1 = SingletonWebDriver.getInstance();
        SingletonWebDriver driver2 = SingletonWebDriver.getInstance();

        System.out.println(driver1.getDriver());
        System.out.println(driver1 == driver2); // Should print true, indicating both references point to the same instance
    }

}
