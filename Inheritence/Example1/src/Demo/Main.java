package Demo;

import java.time.Month;

public class Main {
    public static void main(String[] args) {

        TwoWheeler twoWheeler = new TwoWheeler(123,200);
        System.out.println(twoWheeler);

        twoWheeler.setSpeed(100);
        twoWheeler.setWeight(23);
        System.out.println(twoWheeler);

        Motor motor = new Motor("Honda",100,120);
        System.out.println(motor);

        TwoWheeler twoWheeler1 = new Motor("Honda",10,12);
        System.out.println(twoWheeler1);



    }
}
