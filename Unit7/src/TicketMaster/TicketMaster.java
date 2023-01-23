package TicketMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicketMaster {
    final ArrayList<Show> shows = new ArrayList<Show>();
    final File myFile = new File("src/TicketMaster/showData.txt");
    final Scanner scanFile = new Scanner(myFile);


    public TicketMaster() throws FileNotFoundException {
        readShowData();
    }

    public void readShowData() {
        while (scanFile.hasNextLine()) {
            final String date = scanFile.next();
            final double price = scanFile.nextDouble();
            final int qty = scanFile.nextInt();
            final String[] restOfLine = scanFile.nextLine().split(", ");
            final String performer = restOfLine[0].trim();
            final String city = restOfLine[1].trim();

            shows.add(new Show(date, price, qty, performer, city));
        }
    }

    public ArrayList<Show> showsInCity(String cityName) {
        ArrayList<Show> showsInCity = new ArrayList<Show>();
        for (Show show: shows) {
            if (show.getCity().equalsIgnoreCase(cityName)) {
                showsInCity.add(show);
            }
        }
        return showsInCity;
    }

    @Override
    public String toString() {
        int lengthOfLongestPerformer = 0;
        for (Show show: shows) {
            if (show.getPerformer().length() > lengthOfLongestPerformer) lengthOfLongestPerformer = show.getPerformer().length();
        }
        String showData = "Date\t\tPrice\tQty\t\t" + String.format("%-" + (lengthOfLongestPerformer + 5) + "s", "Performer") + "City\n";
        showData += "--------------------------------------------------------------\n";
        for (Show show: shows) {
            showData += show.getDate() + "\t" + show.getPrice() + "\t" + show.getQty() + "\t\t" + String.format("%-" + (lengthOfLongestPerformer + 5) + "s", show.getPerformer()) + "" + show.getCity() + "\n";
        }
        return showData;
    }
}
