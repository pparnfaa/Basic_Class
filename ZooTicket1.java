package Class_Programming;

import java.util.Scanner;

class ZooTicket {
    int ride = 0;
    int seal = 0;
    int tiger = 0;
    String name;

    ZooTicket(String name) {
        this.name = name;
    }

    void bookRide() {
        ride++;
    }

    void bookSealShow() {
        seal++;
    }

    void bookTigerShow() {
        tiger++;
    }

    void summarize() {
        int price = 0;
        System.out.println(name);
        if (ride == 1) {
            System.out.println("Ride");
            price = price + 40;
        }
        if (seal == 1) {
            System.out.println("Seal");
            price = price + 50;
        }
        if (tiger == 1) {
            System.out.println("Tiger");
            price = price + 65;
        }
        if (ride == 0 && seal == 0 && tiger == 0) {
            System.out.println("100");
        } else {
            System.out.println(100 + price);
        }
    }

}

public class ZooTicket1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        ZooTicket ticket = new ZooTicket(name);
        for (;;) {
            int service = scan.nextInt();
            if (service == 0) {
                break;
            }
            if (service == 1) {
                ticket.bookRide();
            } else if (service == 2) {
                ticket.bookSealShow();
            } else if (service == 3) {
                ticket.bookTigerShow();
            }
        }
        ticket.summarize();
    }
}
