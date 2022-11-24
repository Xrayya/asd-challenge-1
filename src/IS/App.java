package IS;

import java.util.Scanner;

import ADT.ILinkList;
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
                    showAllAntrian();
                    break;

                case "2":
                    addAnAntrian();
                    break;

                case "3":
                    loopMenu = false;
                    sc.close();
                    break;
                default:
                    System.out
                            .println("Sistem menerima masukan yang tidak valid. Harap coba masukan angka yang tertera");
                    break;
            }
        } while (loopMenu);
    }

    public static void addAnAntrian() {
    }

    public static void showAllAntrian() {
    }

    public void showAllQueues() {
        ;
    }
}
