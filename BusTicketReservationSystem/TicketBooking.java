package BusTicketReservationSystem;

import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userOption = 1;

        while (userOption == 1) {
            System.out.println("Enter 1 for TicketBooking and 2 for Exit : ");
            userOption = sc.nextInt();
            if(userOption == 1){
                System.out.println("Booking.........");
            }
        }
    }
}
