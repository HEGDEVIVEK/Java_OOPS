package Demo;

import javax.swing.event.TreeWillExpandListener;
import java.security.PrivateKey;

public class TwoWheeler
{
    private  int speed;
    private int Weight;


    public TwoWheeler(int speed)
    {
        this.speed=speed;
    }
    public TwoWheeler(int speed, int weight)
    {
        this(speed);
        this.Weight=weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight)
    {
        this.Weight=weight;
    }


    @Override
    public String toString()
    {
        System.out.println("Two wheeler");
       return this.speed+" "+this.Weight;
    }


}
