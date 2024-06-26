public class Chevy {
    private int year, mileage;
    private double fuelEfficiency, basePrice, grandTotal, priceWithUpgrades;
    private String model, color;
    private boolean isLuxuryPackage, is4WDPackage, isSportsPackage;
    private final String vehicleMake = "Chevrolet";
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
        calcPrice();
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
        calcPrice();
    }

    public int compareTo(Chevy chevyObj) {
        return mileage - chevyObj.getMiles();
    }

    public boolean equals(Chevy chevyObj) {
        return model.equals(chevyObj.getModel()) && color.equals(chevyObj.getColor()) && ((mileage < 200 && chevyObj.getMiles() < 200) || mileage > 200 && chevyObj.getMiles() > 200);
    }

    public String toString() {
        calcPrice();
        String vehicleDetails = "**************************************************";
        vehicleDetails += "\n" + year + " " + vehicleMake + " " + model + " (" + color + ")";
        vehicleDetails += "\n\tBASE PRICE:\t\t\t\t\t$" + basePrice;
        vehicleDetails += "\n\tMILES:\t\t\t\t\t\t" + mileage;
        vehicleDetails += "\n\tFUEL EFFICIENCY:\t\t\t" + fuelEfficiency + " mpg";
        vehicleDetails += "\n\tPACKAGES:";
        if (isLuxuryPackage) {
            vehicleDetails += "\n\t\t- Luxury Package";
        }
        if (is4WDPackage) {
            vehicleDetails += "\n\t\t- 4WD Package";
        }
        if (isSportsPackage) {
            vehicleDetails += "\n\t\t- Sports Package";
        }
        if (!(isLuxuryPackage || is4WDPackage || isSportsPackage)) {
            vehicleDetails += "\n\t\t- None";
        }
        vehicleDetails += "\n\n\tPRICE WITH UPGRADES:\t\t$" + priceWithUpgrades;
        vehicleDetails += "\n\tFINAL PRICE WITH TAX:\t\t$" + grandTotal;
        vehicleDetails += "\n*************************************************";
        return vehicleDetails;
    }

    public void calcPrice() {
        priceWithUpgrades = basePrice;
        if (isLuxuryPackage) {
            priceWithUpgrades += basePrice * .20;
        }
        if (is4WDPackage) {
            priceWithUpgrades += 3500;
        }
        if (isSportsPackage) {
            priceWithUpgrades += basePrice * .15;
            fuelEfficiency = fuelEfficiency * .8;
        }
        grandTotal = priceWithUpgrades + priceWithUpgrades * .122;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return mileage;
    }

    public void setMiles(int mileage) {
        this.mileage = mileage;
    }

    public double getBase_price() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
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

    public boolean isHasLuxuryPkg() {
        return isLuxuryPackage;
    }

    public void setHasLuxuryPkg(boolean luxuryPackage) {
        isLuxuryPackage = luxuryPackage;
    }

    public boolean isHas4WDPkg() {
        return is4WDPackage;
    }

    public void setHas4WDPkg(boolean is4WDPackage) {
        this.is4WDPackage = is4WDPackage;
    }

    public boolean isHasSportsPackage() {
        return isSportsPackage;
    }

    public void setHasSportsPackage(boolean sportsPackage) {
        isSportsPackage = sportsPackage;
    }

    public double getPriceWithUpgrades() {
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
