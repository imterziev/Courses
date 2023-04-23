package JavaOOP.SOLID.Logger.interfaces;

import JavaOOP.SOLID.Logger.enums.ReportLevel;

public interface Appender {
    void append(String time, String message, ReportLevel reportLevel);

    void setReportLevel(ReportLevel reportLevel);
}