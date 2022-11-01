package Lunch;

public class Noms {
    private String name;
    private int cal;
    private boolean hasPeanuts;

    public Noms(String name, int cal, boolean hasPeanuts) {
        this.name = name;
        this.cal = cal;
        this.hasPeanuts = hasPeanuts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
}
