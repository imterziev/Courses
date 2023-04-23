package JavaOOP.SOLID.Logger.impl.appender;

import JavaOOP.SOLID.Logger.enums.ReportLevel;
import JavaOOP.SOLID.Logger.interfaces.Layout;

public class ConsoleAppender extends BaseAppender {

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if (super.canAppend(reportLevel)) {
            String formattedMessage = this.layout.format(time, message, reportLevel);
            System.out.println(formattedMessage);
            super.increaseMessageCount();
        }
    }
}