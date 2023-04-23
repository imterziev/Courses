package JavaOOP.SOLID.Logger.impl.factories;

import JavaOOP.SOLID.Logger.impl.MessageLogger;
import JavaOOP.SOLID.Logger.interfaces.Appender;
import JavaOOP.SOLID.Logger.interfaces.Factory;
import JavaOOP.SOLID.Logger.interfaces.Logger;

public class LoggerFactory implements Factory<Logger> {
    private AppenderFactory appenderFactory;

    public LoggerFactory() {
        this.appenderFactory = new AppenderFactory();
    }

    @Override
    public Logger produce(String input) {
        String[] tokens = input.split(System.lineSeparator());
        Appender[] appenders = new Appender[tokens.length];

        for (int i = 0; i < appenders.length; i++) {
            appenders[i] = this.appenderFactory.produce(tokens[i]);
        }

        return new MessageLogger(appenders);
    }
}