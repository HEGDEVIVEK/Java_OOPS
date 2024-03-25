package Demo;

public interface Square {

      void message1();

      default void display()
      {
          System.out.println("Square Interface");
      }

      default void area(int x)
      {
          System.out.println("Area of the Square is "+x*x);
      }
}
