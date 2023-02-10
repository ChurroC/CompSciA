package TicketMaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TicketMaster {
    final ArrayList<Show> shows;
    final ArrayList<Show> cityShows;
    boolean cityShowsCurrent;
    final File myFile;
    final Scanner scanFile;


    public TicketMaster() throws FileNotFoundException {
        shows = new ArrayList<Show>();
        cityShows = new ArrayList<Show>();
        cityShowsCurrent = false;
        myFile = new File("src/TicketMaster/showData.txt");
        scanFile = new Scanner(myFile);
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

    public void showsInCity(String cityName) {
        cityShowsCurrent = true;
        ArrayList<Show> temp = cityShowsCurrent ? cityShows : shows;
        for (Show show: temp) {
            if (show.getCity().equalsIgnoreCase(cityName)) {
                temp.add(show);
            }
        }
    }
    public void showsAllShows() {
        cityShowsCurrent = false;
    }

    public void sortByPerformer() {
        ArrayList<Show> temp = cityShowsCurrent ? cityShows : shows;
        for (int i = 0; i < temp.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < temp.size(); j++) {
                if (temp.get(j).getPerformer().compareTo(temp.get(minIndex).getPerformer()) < 0) {
                    minIndex = j;
                }
            }
            temp.set(minIndex, temp.set(i, temp.get(minIndex)));
        }
    }

    public void sortByPrice() {
        ArrayList<Show> temp = cityShowsCurrent ? cityShows : shows;
        for (int i = 1; i < temp.size(); i++) {
            Show show = temp.get(i);
            int index = i;
            while (index > 0 && temp.get(index - 1).getPrice() > show.getPrice()) {
                temp.set(index, temp.get(index - 1));
                index--;
            }
            temp.set(index, show);
            System.out.println(temp);
        }
    }
    
    public void reverse() {
        ArrayList<Show> temp = cityShowsCurrent ? cityShows : shows;
        for (int i = 0; i < temp.size() / 2; i++) {
            temp.set(temp.size() - i - 1, temp.set(i, temp.get(temp.size() - i - 1)));
        }
    }

    @Override
    public String toString() {
        ArrayList<Show> temp = cityShowsCurrent ? cityShows : shows;
        int lengthOfLongestPerformer = 0;
        for (Show show: temp) {
            if (show.getPerformer().length() > lengthOfLongestPerformer) lengthOfLongestPerformer = show.getPerformer().length();
        }
        String showData = "Date\t\tPrice\tQty\t\t" + String.format("%-" + (lengthOfLongestPerformer + 5) + "s", "Performer") + "City\n";
        showData += "--------------------------------------------------------------\n";
        for (Show show: temp) {
            showData += show.getDate() + "\t" + show.getPrice() + "\t" + show.getQty() + "\t\t" + String.format("%-" + (lengthOfLongestPerformer + 5) + "s", show.getPerformer()) + "" + show.getCity() + "\n";
        }
        return showData;
    }
}
