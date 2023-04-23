package JavaOOP.SOLID.Logger.impl.appender;

import JavaOOP.SOLID.Logger.enums.ReportLevel;
import JavaOOP.SOLID.Logger.interfaces.Appender;
import JavaOOP.SOLID.Logger.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    private final static ReportLevel DEFAULT_REPORT_LEVEL = ReportLevel.INFO;
    protected Layout layout;
    protected ReportLevel reportLevel;
    private int messageCount;

    public BaseAppender(Layout layout, ReportLevel reportLevel) {
        this.layout = layout;
        this.reportLevel = reportLevel;
        this.messageCount = 0;
    }

    public BaseAppender(Layout layout) {
        this(layout, DEFAULT_REPORT_LEVEL);
    }

    public boolean canAppend(ReportLevel reportLevel) {
        return this.reportLevel.ordinal() <= reportLevel.ordinal();
    }

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }

    public void increaseMessageCount() {
        this.messageCount++;
    }

    @Override
    public String toString() {
        return String.format("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                this.getClass().getSimpleName(), this.layout.getClass().getSimpleName(), this.reportLevel, this.messageCount);
    }
}