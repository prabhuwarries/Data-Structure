package frameworkCreateRelatedQes;
import com.azul.crs.util.logging.Logger;

import java.util.logging.*;


public class LoggerUtility {
    private static final Logger logger = Logger.getLogger(Log.class.getName().getClass());

    public static void info(String message) {
//        logger.log(Level.INFO, message);
    }

    public static void error(String message) {
//        logger.log(Level.SEVERE, message);
    }

    public static void main(String[] args) {
        Logger Log = null;
//        Log.info("Starting Test");
        Log.error("Something went wrong!");
    }
}
