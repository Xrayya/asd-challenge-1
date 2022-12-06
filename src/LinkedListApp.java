public class LinkedListApp {

    public static void main(String[] args) {
        // data
        Car car1 = new Car("Honda", "Jazz", 2004);
        Car car2 = new Car("Toyota", "GR Yaris", 2022);
        Car car3 = new Car("Mazda", "RX8", 2002);
        Car car4 = new Car("Daihatsu", "Terios", 2015);
        Car car5 = new Car("Daihatsu", "Luxio", 2009);

        // // ILinkList
        // ILinkList<Car> ill = new LinkList<>();
        //
        // System.out.println(ill.isEmpty());
        //
        // ill.addLast(car1);
        // ill.addLast(car2);
        // System.out.println(ill);
        //
        // System.out.println(ill.isEmpty());
        //
        // ill.addFirst(car3);
        // System.out.println(ill);
        //
        // Node<Car> searchedCar = ill.find(new Car("Toyota", "GR Yaris", 2022));
        // System.out.println(searchedCar);
        //
        // ill.addAfter(searchedCar, car4);
        // System.out.println(ill);
        //
        // ill.addBefore(ill.find(new Car("Honda", "Jazz", 2004)), car5);
        // System.out.println(ill);
        //
        // ill.forwardTraverse();
        // ill.reverseTraverse();
        //
        // System.out.println(ill.removeFirst());
        // System.out.println(ill.removeLast());
        //
        // System.out.println(ill);
        //
        // System.out.println(ill.removeAfter(car5));
        //
        // System.out.println(ill);
        //
        // System.out.println(ill.removeBefore(car2));
        //
        // System.out.println(ill);
        //
        // System.out.println(ill.remove(new Car("Toyota", "GR Yaris", 2022)));
        //
        // System.out.println(ill.isEmpty());

        // // IStack
        // IStack<Car> stack = new LinkList<>();
        //
        // stack.push(car1);
        // stack.push(car2);
        // stack.push(car3);
        //
        // System.out.println(stack);
        //
        // System.out.println(stack.pop());
        // System.out.println(stack);
        //
        // System.out.println(stack.peek());
        //
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        //
        // System.out.println(stack);
        // System.out.println(stack.isEmpty());

        // // IQueue
        // IQueue<Car> queue = new LinkList<>();
        // queue.enqueue(car1);
        // queue.enqueue(car2);
        // queue.enqueue(car3);
        //
        // System.out.println(queue);
        //
        // System.out.println(queue.dequeue());
        // System.out.println(queue);
        //
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        //
        // System.out.println(queue);
        // System.out.println(queue.isEmpty());

        // LinkList<Car> linkList = new LinkList<>();
        //
        // linkList.addLast(car1);
        // linkList.addLast(car2);
        // linkList.addLast(car3);
        //
        // System.out.println(linkList.size);
        // System.out.println(linkList.removeLast());
        // System.out.println(linkList.size);
        //
        // System.out.println(linkList);
        // System.out.println(linkList.getFirst());
        // System.out.println(linkList.getLast());
        //
        // linkList.addLast(car4);
        // linkList.addLast(car5);
        //
        // System.out.println();
        //
        // System.out.println(linkList);
        // for (Car car : linkList) {
        // System.out.println(car);
        // }

        // IPriorityList
        PriorityList<Car> pl = new PriorityList<>();

        pl.enqueue(car3);
        pl.enqueue(car1);
        pl.enqueue(car2);

        System.out.println(pl);
    }
}
