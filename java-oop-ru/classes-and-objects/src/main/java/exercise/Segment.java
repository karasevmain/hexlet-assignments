package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    Segment(Point point1, Point point2) {
        this.beginPoint = point1;
        this.endPoint = point2;
    }

    public Point getBeginPoint() {
        return this.beginPoint;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public Point getMidPoint() {
        return new Point((beginPoint.getX() + endPoint.getX()) / 2,  (beginPoint.getY() + endPoint.getY()) / 2);
    }
}
// END
