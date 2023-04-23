package JavaOOP.SOLID.Logger.interfaces;

import JavaOOP.SOLID.Logger.enums.ReportLevel;

public interface Layout {

    String format(String time, String message, ReportLevel reportLevel);
}