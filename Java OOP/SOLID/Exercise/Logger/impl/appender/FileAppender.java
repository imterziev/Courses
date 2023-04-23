package JavaOOP.SOLID.Logger.impl.appender;

import JavaOOP.SOLID.Logger.enums.ReportLevel;
import JavaOOP.SOLID.Logger.interfaces.File;
import JavaOOP.SOLID.Logger.interfaces.Layout;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout) {
        super(layout);
        this.file = new LogFile();
    }

    public FileAppender(Layout layout, String filename) {
        this(layout);
        this.file = new LogFile(filename);
    }

    @Override
    public void append(String time, String message, ReportLevel reportLevel) {
        if (super.canAppend(reportLevel)) {
            String output = super.layout.format(time, message, reportLevel);
            file.append(output);
            super.increaseMessageCount();
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }
}