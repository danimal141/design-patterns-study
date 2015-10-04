/**
 * Created by hideaki on 10/5/15.
 */
public class Main {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println("");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");
        System.out.println("");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

}
