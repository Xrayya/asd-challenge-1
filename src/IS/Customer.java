package IS;

import ADT.ILinkList;
import ADT.LinkList;

public class Customer implements Comparable<Customer> {
    private String name;
    private Integer id;
    private Car car;
    private LinkList<Service> serviceList;
    private boolean isVIP;

    public Customer(String name, Car car) {
        this.name = name;
        this.car = car;
        this.serviceList = new LinkList<>();
        this.isVIP = false;
        this.id = id++;
    }

    public Customer(String name, Car car, LinkList<Service> serviceList) {
        this.name = name;
        this.car = car;
        this.serviceList = serviceList;
        this.isVIP = false;
        this.id = id++;
    }

    public Customer(String name, Car car, LinkList<Service> serviceList, boolean isVIP) {
        this.name = name;
        this.car = car;
        this.serviceList = serviceList;
        this.isVIP = isVIP;
        this.id = id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ILinkList<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(LinkList<Service> serviceList) {
        this.serviceList = serviceList;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean isVIP) {
        this.isVIP = isVIP;
    }

    @Override
    public int compareTo(Customer anotherCustomer) {
        return isVIP ? this.id.compareTo(anotherCustomer.id) : 0;
    }

    private String getFormattedServiceList() {
        String output = "";
        output += "--------------------------------------------------";
        output += "             List of Ordered Services             ";
        output += "--------------------------------------------------";
        for (Service service : serviceList) {
            output += service.toString();
            output += "--------------------------------------------------";
        }

        return output;
    }

    public int getTotalPrice() {
        int total = 0;
        for (Service service : serviceList) {
            total += service.getPrice();
        }

        return total;
    }

    @Override
    public String toString() {
        String output = "";

        output += String.format("%-15s : %s\n", "Customer Id", this.id);
        output += String.format("%-15s : %s %s\n", "Name", this.name, this.isVIP ? "(VIP)" : "");
        output += String.format("%-15s : %s\n", "Car", this.car.toString());
        output += this.getFormattedServiceList();
        output += String.format("%-15s : %s\n", "Total Bill", Helper.getFormattedPrice(this.getTotalPrice()));

        return output;
    }

}
