package Demo;

public interface Third extends First,Second{

    public void third();


    @Override
    default void display() {
        First.super.display();
        Second.super.display();
    }
}
