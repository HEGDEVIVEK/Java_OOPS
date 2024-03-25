package Demo;

public interface First {

    public void first();

    default void display()
    {
        System.out.println("First method from First class");
    }
}
