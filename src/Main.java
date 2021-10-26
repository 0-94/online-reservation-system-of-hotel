
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        char next;


        System.out.println("             Welcome to Hotel La Vista       ");

        System.out.println("Press 1 to Add Personal Information ");
        System.out.println("Press 2 for Check In Details ");
        System.out.println("press 3 for Check Out Details ");
        System.out.println("Press 4 for Room Booking ");
        System.out.println("press 5 to  End ");
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your option to proceed: ");

            int opt = input.nextInt();

            switch (opt) {
                case 1:
                    Reservation one = new Reservation();
                    one.info();
                    break;
                case 2:
                    Reservation two = new Reservation();
                    two.checkIn();
                    break;
                case 3:
                    Reservation three = new Reservation();
                    three.checkOut();
                    break;
              /*  case 4:
                    Reservation four = new Reservation();
                    four.Booking();*/
                case 5:
                    Reservation five = new Reservation();
                    five.exit();
                    break;
                default:
                    System.out.println("Select from 1-5");


            }
            System.out.println("\n Press N to choose next and E to end ");
            next = input.next().charAt(0);
        }
        while (next == 'n' || next == 'N');
        if (next == 'E' || next == 'e') ;
        {
            Reservation nxt = new Reservation();
            nxt.exit();
        }






    }
}