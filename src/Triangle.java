public class Triangle extends Shape {

    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(Point location, int sideA, int sideB, int sideC) {
        super(location);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return (this.sideA*sideB)/2;

    }

    @Override
    public double perimeter() {
        return this.sideC+sideB+sideA;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }


}
