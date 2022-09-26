public class Chevy {
    private int year, mileage, basePrice, grandTotal;
    private double fuelEfficiency;
    private String model, color;
    private boolean isLuxuryPackage, is4WDPackage, isSportsPackage;
    private final String vehicalMake = "Chevrolet";
    private final double taxRate = .122;
    public Chevy() {
        year = 2021;
        mileage = 0;
        fuelEfficiency = 35;
        basePrice = 16000;
        model = "Trax";
        color = "White";
        isLuxuryPackage = false;
        is4WDPackage = false;
        isSportsPackage = false;
    }
    public Chevy(int year, int mileage, double fuelEfficiency, int basePrice, String model, String color, boolean isLuxuryPackage, boolean is4WDPackage, boolean isSportsPackage) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.model = model;
        this.color = color;
        this.isLuxuryPackage = isLuxuryPackage;
        this.is4WDPackage = is4WDPackage;
        this.isSportsPackage = isSportsPackage;
    }

    public int compareTo(Chevy chevyObj) {
        return mileage - chevyObj.getMileage();
    }

    public boolean equals(Chevy chevyObj) {
        if (model == chevyObj.getModel() && color == chevyObj.getColor())
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxuryPackage() {
        return isLuxuryPackage;
    }

    public void setLuxuryPackage(boolean luxuryPackage) {
        isLuxuryPackage = luxuryPackage;
    }

    public boolean isIs4WDPackage() {
        return is4WDPackage;
    }

    public void setIs4WDPackage(boolean is4WDPackage) {
        this.is4WDPackage = is4WDPackage;
    }

    public boolean isSportsPackage() {
        return isSportsPackage;
    }

    public void setSportsPackage(boolean sportsPackage) {
        isSportsPackage = sportsPackage;
    }
}
