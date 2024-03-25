package Demo;

public interface Second {
    public void second();

    default void display()
    {
        System.out.println("Second method from Second class");
    }

}
