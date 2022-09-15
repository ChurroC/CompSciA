public class Pizza {
    private String store;
    private int inches, numToppings;
    private boolean isDeepDish;

    public Pizza(String storeInput, int inchesInput, boolean isDeepDishInput) {
        store = storeInput;
        inches = inchesInput;
        numToppings = 0;
        isDeepDish = isDeepDishInput;
    }
    public Pizza(String storeInput, int inchesInput, int numToppingsInput, boolean isDeepDishInput) {
        store = storeInput;
        inches = inchesInput;
        numToppings = numToppingsInput;
        isDeepDish = isDeepDishInput;
    }

    public boolean equals(Pizza obj) {
        if (obj.getInches() == this.inches) {
            if (obj.getNumToppings() == this.numToppings) {
                if (obj.isDeepDish() == this.isDeepDish) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        String output = "";

        output += "Store" + this.getStore() + "\n";
        output += "Size" + this.getInches() + " inches\n";
        output += "Number Of Toppings:" + this.getNumToppings() + "\n";
        output += "Deep Dish" + (isDeepDish ? "YES" : "NO");

        return output;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = this.inches;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }
}