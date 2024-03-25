package Demo;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.display();
        parent.how();
       /// parent.hello();

        Child child = new Child();
        child.display();
        child.how();   //parent
        child.hello(); //child

        Parent parent1 = new Child();
        parent1.display();
        parent1.how();
        //parent1.hello();

    }
}
