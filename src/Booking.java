import java.util.Scanner;

public class Booking extends Reservation{


        static RoomDB roomDB = new RoomDB();

        public static void main(String[] args) {
            String roomID;
            Room room;
            Scanner inputID = new Scanner(System.in);

            while(true){

                System.out.println("Please choose the room you want to book \n"+getRoomList(roomDB));

                while(true){
                    System.out.println("Enter your Room no: ");

                    roomID = inputID.nextLine();

                    if(roomID.equals("x")){

                        break;
                    }

                    if(getRoom(roomID) == null){

                        System.out.println("The room ID is incorrect try again");

                    }
                    else{

                        room = getRoom(roomID);

                        if(!room.isBooked()){
                            System.out.println("Booked successfully");

                            room.setBooked(true);
                            System.exit(0);
                        }

                        else{
                            System.out.println("please enter the room ID again ");

                        }

                    }
                    // System.exit(0);
                }


            }

        }

        public static String getRoomList(RoomDB roomDB)
        {

            String roomList = "";
            for(Room r:roomDB.getRoom())
            {

                if(!r.isBooked())
                {
                    roomList = roomList+r.getRoomID()+" is free"+"   ";
                }
                else
                {
                    roomList = roomList+r.getRoomID()+" has been booked ";
                }

            }
            return roomList;
        }


        public static Room getRoom(String roomID) {

            for (Room r : roomDB.getRoom()) {

                if (r.getRoomID().equals(roomID)) {

                    return r;
                }

            }
            return null;

        }
    }





