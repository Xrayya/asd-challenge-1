public class LinkedListApp {

    public static void main(String[] args) {

        ILinkList<Mobil> list = new LinkList<Mobil>();
        // IStack<Mobil> stack = new LinkList<Mobil>();
        // IQueue<Mobil> queue = new LinkList<Mobil>();
        // IPriorityQueue<Mobil> pQueue = new PriorityList<Mobil>(null);

        list.addLast(new Mobil("Honda", "Jazz", 2004));
        list.addLast(new Mobil("Toyota", "GR Yaris", 2022));
        list.addLast(new Mobil("Mazda", "RX8", 2002));

        System.out.println(list);

    }
}
