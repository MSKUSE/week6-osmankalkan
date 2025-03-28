public class Circle extends Shape {


    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }



    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }

    }

    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "location=" + getLocation()  +
                ", radius=" + radius +
                '}';
    }


}
