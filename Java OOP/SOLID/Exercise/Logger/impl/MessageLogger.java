package JavaOOP.SOLID.Logger.impl;

import JavaOOP.SOLID.Logger.enums.ReportLevel;
import JavaOOP.SOLID.Logger.interfaces.Appender;
import JavaOOP.SOLID.Logger.interfaces.Logger;

import java.util.Arrays;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appender) {
        this.appenders = appender;
    }

    @Override
    public void logInfo(String time, String message) {
        log(time, message, ReportLevel.INFO);
    }

    @Override
    public void logWarning(String time, String message) {
        log(time, message, ReportLevel.WARNING);
    }

    @Override
    public void logError(String time, String message) {
        log(time, message, ReportLevel.ERROR);
    }

    @Override
    public void logCritical(String time, String message) {
        log(time, message, ReportLevel.CRITICAL);
    }

    @Override
    public void logFatal(String time, String message) {
        log(time, message, ReportLevel.FATAL);
    }

    private void log(String time, String message, ReportLevel reportLevel) {
        Arrays.stream(appenders).forEach(a -> a.append(time, message, reportLevel));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Logger info");

        sb.append(System.lineSeparator());

        for (Appender appender : appenders) {
            sb.append(appender).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}