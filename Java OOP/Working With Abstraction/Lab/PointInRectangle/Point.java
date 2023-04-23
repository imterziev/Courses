package JavaOOP.WorkingWithAbstraction.Lab.PointInRectangle;

public class Point {
    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public boolean isGreaterOrEqual(Point point) {
        return this.pointX >= point.pointX && this.pointY >= point.pointY;
    }

    public boolean isLessThanOrEqual(Point point) {
        return this.pointX <= point.pointX && this.pointY <= point.pointY;
    }
}