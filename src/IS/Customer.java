package IS;

import ADT.IQueue;
import ADT.LinkList;

public class Customer implements Comparable<Customer> {
    private String name;
    private Integer id;
    private Car car;
    private IQueue<Service> serviceList;
    boolean isVIP;

    public Customer(String name, Car car) {
        this.name = name;
        this.car = car;
        this.serviceList = new LinkList<>();
        this.isVIP = false;
        this.id = id++;
    }

    public Customer(String name, Car car, IQueue<Service> serviceList) {
        this.name = name;
        this.car = car;
        this.serviceList = serviceList;
        this.isVIP = false;
        this.id = id++;
    }

    public Customer(String name, Car car, IQueue<Service> serviceList, boolean isVIP) {
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

    public IQueue<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(IQueue<Service> serviceList) {
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
        if (isVIP()) {
            return this.id.compareTo(anotherCustomer.id);
        }

        return 0;
    }
}
