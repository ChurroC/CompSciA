package TicketMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketMaster {
    final ArrayList<Show> shows = new ArrayList<Show>();
    final File myFile = new File("src/TicketMaster/showData.txt");
    final Scanner scan = new Scanner(myFile);

    public TicketMaster() throws FileNotFoundException {
        readShowData();
    }

    public void readShowData() {
        while (scan.hasNextLine()) {
            //shows.add(new Show(
            //        scan.next(),
            //        scan.nextDouble(),
            //        scan.nextInt(),
            //        scan.next(),
            //        scan.next()
            //));

            final String date = scan.next();
            System.out.println(date);
            final double price = scan.nextDouble();
            System.out.println(price);
            final int qty = scan.nextInt();
            System.out.println(qty);
            final String performer = scan.next();
            System.out.println(performer);
            final String city = scan.next();
            System.out.println(city);
        }
    }

    @Override
    public String toString() {
        String showData = """
                Date\tPrice\tQty\t\tPerformer\tCity
                ----------------------------------------    
                """;
        for (Show show: shows) {
            showData += show.getDate() + "\t" + show.getDate() + "\t" + show.getDate() + "\t" + show.getDate() + "\t" + show.getDate() + "\t";
        }
        return showData;
    }
}
