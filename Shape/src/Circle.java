public class Circle extends Shape {
    private Integer r;

    public Circle(int r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
