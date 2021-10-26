import java.util.Scanner;

class Reservation {
    static  String name;
    static int num;
    static String indate, outdate;
    static String intime, outtime;

    void info() {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Name: ");
        name = input1.nextLine();
        System.out.println("Phone Number: ");
        num = input1.nextInt();
        input1.nextLine();
        System.out.println("Customer Name : " + name);
        System.out.println("Phone Number: " + num);
    }

    void checkIn(){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Check In Date: ");
        indate = input2.nextLine();
        System.out.println("Enter Check In Time: ");
        intime = input2.nextLine();

        System.out.println("Check In Date: "+indate);
        System.out.println("Check In Time: "+ intime);



    }

    void checkOut(){
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Check out Date: ");
        outdate = input3.nextLine();
        System.out.println("Enter Check out Time: ");
        outtime = input3.nextLine();

        System.out.println("Check Out Date: " + outdate);
        System.out.println("Check Out Time: "+ outtime);

    }

    void roomBooking (){



}




    void exit(){
        System.out.println("Operation closed ");
        System.exit(0);
    }


}



