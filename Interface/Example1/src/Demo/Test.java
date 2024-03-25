package Demo;

public class Test implements Circle,Square
{

    @Override
    public void message() {
        System.out.println("Overrided Circle message method");
    }

    @Override
    public void message1() {
        System.out.println("Overrided Square message1 method");
    }

    @Override
    public void display() {
        Circle.super.display();
        Square.super.display();
    }

    @Override
    public void area(int a) {
        Circle.super.area(a);
        Square.super.area(a);
    }

    public void calculate_both_area(int z)
    {
        Circle.super.area(z);
        Square.super.area(z);
    }
}
