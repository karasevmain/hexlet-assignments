package exercise;
public class Flat implements Home {
    final private double area;
    final private double balconyArea;
    final private int floor;
    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }
    @Override
    public double getArea() {
        return this.area + this.balconyArea;
    }
    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }
    @Override
    public String toString() {
       return "Квартира площадью " + this.getArea() + " метров на " + this.floor + " этаже";
    }
}