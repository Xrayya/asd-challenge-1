package IS;

import java.util.Scanner;

import ADT.ILinkList;
import ADT.LinkList;
import ADT.PriorityList;

public class App {
    final static ILinkList<Service> services = Helper.initializeServices();
    final static PriorityList<Customer> queue = new PriorityList<>();
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean loopMenu = true;
        do {
            System.out.println("Selamat datang pada aplikasi terminal sederhana!");
            System.out.println("Silakan pilih salah satu menu di bawah ini:");
            System.out.println("1. Menampilkan semua antrian pada hari ini");
            System.out.println("2. Menambahkan antrian");
            System.out.println("3. Log Out dari sistem");

            System.out.print("Masukan Anda: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    showAllQueues();
                    break;

                case "2":
                    handleAddQueue();
                    break;

                case "3":
                    loopMenu = false;
                    sc.close();
                    break;
                default:
                    System.out.println("The system received an invalid input. Please try to enter the numbers listed");
                    break;
            }
        } while (loopMenu);
    }

    public static void handleAddQueue() {
        Customer newCustomer = new Customer();
        System.out.printf("%-40s : ", "Enter the customer's name");
        newCustomer.setName(sc.nextLine());
        System.out.printf("%-40s : ", "Enter the the car brand");
        newCustomer.getCar().setBrand(sc.nextLine());
        System.out.printf("%-40s : ", "Enter the the car tipe");
        newCustomer.getCar().setTipe(sc.nextLine());
        System.out.printf("%-40s : ", "Enter the year the car was released");
        newCustomer.getCar().setTipe(sc.nextLine());
        System.out.printf("%-40s : ", "Enter the vehicle number");
        newCustomer.getCar().setVehicleNumber(sc.nextLine());

        LinkList<Service> customerServices = new LinkList<>();

        do {
            ;
        } while (customerServices.size > 3);
    }

    public static void showAllQueues() {
        System.out.println(Helper.getDoubleLineSeparator());
        System.out.println("                  List All Queues                 \n");
        System.out.println(Helper.getDoubleLineSeparator());

        if (queue.isEmpty()) {
            System.out.println("                  --- No queue ---                \n");
            System.out.println(Helper.getSingleLineSeparator());
            return;
        }

        for (Customer customer : queue) {
            System.out.println(customer.toString());
            System.out.println(Helper.getSingleLineSeparator());
        }
    }
}
