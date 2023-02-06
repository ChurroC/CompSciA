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

    public void sortByPerformer() {
        for (int i = 0; i < shows.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < shows.size(); j++) {
                if (shows.get(j).getPerformer().compareTo(shows.get(minIndex).getPerformer()) < 0) {
                    minIndex = j;
                }
            }
            shows.set(minIndex, shows.set(i, shows.get(minIndex)));
        }
        System.out.println(shows);
    }

    public void sortByPrice() {
        System.out.println(shows);
        for (int i = 1; i < shows.size(); i++) {
            Show show = shows.get(i);
            int index = i;
            while (index > 0 && shows.get(i - 1).getPrice() > show.getPrice()) {
                shows.set(index, shows.get(i - 1));
                index--;
            }
            shows.set(index, show);
            System.out.println(shows);
        }
    }
    
    public void reverse() {
        
        for (int i = 0; i < shows.size(); i++) {
            shows.set(shows.size() - 1 - i, shows.get(i));
        }
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
