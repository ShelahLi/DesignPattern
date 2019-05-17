
public class Client2 {

    public static void main(String[] args) {
        ILoggerFactory loggerFactory;
        ILogger logger;
        //loggerFactory = new FileLoggerFactory();
        loggerFactory = (ILoggerFactory) XMLUtil2.getBean();
        logger = loggerFactory.createLogger();
        logger.writeLogger();
    }
}
