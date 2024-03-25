package Demo;

public class Square extends Item {

    private int lenght;
    private int bredth;



    public Square(String color,int id,int lenght, int bredth)
    {
        super(color,id);
        this.lenght=lenght;
        this.bredth=bredth;
    }

    public int area()
    {
        return lenght*bredth;
    }

    @Override
    public String toString() {
        return (super.toString()+ " Square{" +
                "length=" + lenght +
                ", bredth=" + bredth +
                '}'+ " Finally area is "+ area() );
    }
}
