package Demo;

public class Employee extends Person {

    private int empid;

    public Employee(String name, int id)
    {
        super(name);
        this.empid=id;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Employee Id is "+this.empid);

    }
}
