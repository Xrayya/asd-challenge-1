public class LinkedListApp {

    public static void main(String[] args) {
        // data
        Car car1 = new Car("Honda", "Jazz", 2004);
        Car car2 = new Car("Toyota", "GR Yaris", 2022);
        Car car3 = new Car("Mazda", "RX8", 2002);
        Car car4 = new Car("Daihatsu", "Terios", 2015);
        Car car5 = new Car("Daihatsu", "Luxio", 2009);

        // ILinkList
        ILinkList<Car> ill = new LinkList<>();

        ill.addLast(car1);
        ill.addLast(car2);
        System.out.println(ill);

        ill.addFirst(car3);
        System.out.println(ill);

        Node<Car> searchedCar = ill.find(new Car("Toyota", "GR Yaris", 2022));
        System.out.println(searchedCar);

        ill.addAfter(searchedCar, car4);
        System.out.println(ill);

        ill.addBefore(ill.find(new Car("Honda", "Jazz", 2004)), car5);
        System.out.println(ill);
    }
}
