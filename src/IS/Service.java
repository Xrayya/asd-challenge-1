package IS;

public class Service {
    private String name;
    private int id;
    private int price;
    private String description;

    public Service(String name, int price) {
        setName(name);
        setPrice(price);
        this.id = id++;
    }

    public Service(String name, int price, String description) {
        setName(name);
        setPrice(price);
        setDescription(description);
        this.id = id++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getId() {
        return this.id;
    }

    public String getDescription() {
        return description;
    }

    public String getFormattedPrice() {
        return Helper.getFormattedPrice(this.price);
    }

    public String toString() {
        return "Name\t\t: " + this.name + "\n" +
                "Price\t\t: " + this.getFormattedPrice() + "\n";
    }
}
