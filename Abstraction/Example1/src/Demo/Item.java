package Demo;

public abstract class Item {

    //Similar to Inheritence example 3

    private String color;

    //constructor allowed
    public Item(String color)
    {
   this.color=color;
    }

    public void display()
    {
        System.out.println("Color is "+this.color);
    }

    //To string also allowed
    public abstract double area();

}
