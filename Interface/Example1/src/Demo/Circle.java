package Demo;

public interface Circle {

    void message();
    default void display()
    {
        System.out.println("Circle Interface");

    }

    default void area(int a)
    {
        System.out.println("Area of the Circle is "+3.14*a*a);
    }
}
