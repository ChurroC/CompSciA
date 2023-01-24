package TicketMaster;

import java.io.FileNotFoundException;
import java.nio.file.LinkPermission;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        final TicketMaster ticketMaster = new TicketMaster();
        final Scanner scan = new Scanner(System.in);
        boolean run = true;
        while (run) {
            try {
                System.out.println("1. Show all shows");
                System.out.println("2. Sort From A-Z");
                System.out.println("3. Sort From Z-A");
                System.out.println("4. Ticket Price From Low To High");
                System.out.println("5. Ticket Price From High To Low");
                System.out.println("6. Search By City");
                System.out.println("7. Quit");
                int input = scan.nextInt();
                System.out.println("input");
                System.out.println(input);
                switch (input) {
                    case 1:
                        System.out.println(ticketMaster);
                        break;
                    case 2:
                        System.out.println(ticketMaster);
                        break;
                    case 3:
                        System.out.println(ticketMaster);
                        break;
                    case 4:
                        System.out.println(ticketMaster);
                        break;
                    case 5:
                        System.out.println(ticketMaster);
                        break;
                    case 6:
                        System.out.println(ticketMaster);
                        break;
                    case 7:
                        System.out.println(ticketMaster);
                        break;
                    default:
                        while (input > 7 || input < 0) {
                            System.out.println("Number must be from 1 to 7");
                            input = scan.nextInt();
                        }
                }
            } catch (InputMismatchException e) {
                System.out.println("Please Respond With an Int Next Time");
                scan.nextLine();
            }
        }
        //System.out.println(ticketMaster);
    }
}
