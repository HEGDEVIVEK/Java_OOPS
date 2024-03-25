package Demo;

public class Circle extends Item {

    private int radius;

    public Circle(String color, int id,int radius) {
        super(color, id);
        this.radius=radius;

    }

    public double area()
    {
        return 3.14*radius*radius;
    }

    @Override
    public String toString() {
        return (super.toString()+" Circle{" +
                "radius=" + radius +
                '}'+" Finally area is "+area());
    }
}
