package ADT;

import IS.Car;

public class LinkedListApp {

    public static void main(String[] args) {

        // ILinkList
        ILinkList<Car> list = new LinkList<Car>();

        System.out.println("list isEmpty : " + list.isEmpty());

        list.addLast(new Car("Honda", "Jazz", 2004));
        list.addLast(new Car("Toyota", "GR Yaris", 2022));
        list.addLast(new Car("Mazda", "RX8", 2002));

        System.out.println("list isEmpty : " + list.isEmpty());

        System.out.println(list);

        list.addFirst(new Car("Suzuku", "APV", 2022));

        list.forwardTraverse();
        list.reverseTraverse();

        ;

        IPriorityQueue<Car> pQueue = new PriorityList<Car>(null);
    }
}
