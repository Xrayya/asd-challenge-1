package IS;

public class Service {
    private String serviceName;
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
        this.serviceName = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return serviceName;
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
        String output = "";

        output += String.format("%-15s : %s\n", "Service Name", this.serviceName);
        output += String.format("%-15s : %s\n", "Price", this.getFormattedPrice());

        return output;
    }
}
