package Demo;

public class HourlyEmployee extends Employee {

    private int hr;
    private int hw;

    public HourlyEmployee(String name,int id, int hr, int hw)
    {
        super(name,id);
        this.hr=hr;
        this.hw=hw;
    }

    public int netamount()
    {
       return hr*hw;
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("Hourly payable amount "+this.hr);
        System.out.println("Total hour of work "+this.hw);
        System.out.println("Total Salary is "+netamount());
    }
}
