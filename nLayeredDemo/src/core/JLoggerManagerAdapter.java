package core;

import JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

    JLoggerManager jLoggerManager = new JLoggerManager();
    @Override
    public void logToSystem(String message) {
        jLoggerManager.log(message);
    }
}
