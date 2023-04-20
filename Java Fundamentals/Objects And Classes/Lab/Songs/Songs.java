package ProgrammingFundamentals.ObjectsAndClasses.Lab.Songs;

public class Songs {
    private String type;
    private String name;
    private String time;

    public Songs(String type, String name, String time) {
        this.type = type;
        this.name = name;
        this.time = time;
    }

    public String toString() {
        return this.name;
    }

    public String getType() {
        return type;
    }
}