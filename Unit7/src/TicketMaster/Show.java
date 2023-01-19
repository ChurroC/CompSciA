package TicketMaster;

public class Show {
    private String date, performer, city;
    private int qty;
    private double price;

    public Show(String date, double price, int qty, String performer, String city) {
        this.date = date;
        this.price = price;
        this.qty = qty;
        this.performer = performer;
        this.city = city;
    }

    @Override
    public String toString() {
        return performer + " at " + city + " on " + date + " for " + price + " with " + qty + " seats open.";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
