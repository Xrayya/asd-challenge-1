package IS;

import ADT.ILinkList;
import ADT.PriorityList;

public class App {
    public final ILinkList<Service> services = Helper.initializeServices();
    public final PriorityList<Customer> queue = new PriorityList<>();

    public static void main(String[] args) {
        ;
    }
}
