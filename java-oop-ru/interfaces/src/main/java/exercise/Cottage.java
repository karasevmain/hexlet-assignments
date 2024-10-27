package exercise;
public class Cottage implements Home {
    final private double area;
    final private int floor;
    public Cottage(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }
    @Override
    public double getArea() {
        return this.area;
    }
    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }
    @Override
    public String toString() {
        return this.floor + " этажный коттедж площадью " + this.getArea() + " метров";
    }
}
