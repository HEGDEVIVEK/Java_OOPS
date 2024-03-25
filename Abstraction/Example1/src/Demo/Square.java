package Demo;

public class Square extends Item {

    private double size;
    public Square(String color, double size)
    {
        super(color);
        this.size=size;
    }
    @Override
    public double area() {

        return size*size;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Area is "+area());
    }
}
