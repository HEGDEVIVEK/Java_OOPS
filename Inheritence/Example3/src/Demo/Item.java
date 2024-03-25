package Demo;

public class Item {

    
    private String color;
    private int id;

    public Item(String color, int id)
    {
        this.color=color;
        this.id=id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
}
