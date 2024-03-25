package Demo;

public class Motor extends TwoWheeler{

    private String name = "";
    private  int speed;
    private int Weight;



    public Motor(String name, int speed, int weight)
    {
        super(speed,weight);
        this.name=name;
    }

    @Override
    public String toString() {
        System.out.println("Motor");
        String details= super.toString();
        return details+" "+this.name;

    }

}
