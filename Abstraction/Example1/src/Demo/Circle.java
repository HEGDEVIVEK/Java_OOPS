package Demo;

public class Circle extends Item {

    private double size;
     public Circle(String color, double size)
     {
         super(color);
         this.size=size;
     }
    @Override
    public double area() {

         return 3.14*size*size;

    }

    @Override
    public void display() {
        super.display();
        System.out.println("Area is "+area());
    }
}
