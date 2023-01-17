package TicketMaster;

import java.io.FileNotFoundException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        final TicketMaster ticketMaster = new TicketMaster();
        ticketMaster.readShowData();
        System.out.println(ticketMaster);
    }
}
