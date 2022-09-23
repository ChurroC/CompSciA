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
        return obj.getInches() == this.inches && obj.getNumToppings() == this.numToppings && obj.isDeepDish() == this.isDeepDish;
    }

    public String toString() {
        String output = "";

        output += "Store: " + this.getStore() + "\n";
        output += "Size: " + this.getInches() + " inches\n";
        output += "Number Of Toppings:" + this.getNumToppings() + "\n";
        output += "Deep Dish: " + (isDeepDish ? "YES" : "NO");

        return output;
    }

    public int compareTo(Pizza pizzaObj) {
        return this.store.compareTo(pizzaObj.getStore());
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
        this.inches = inches;
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

    public void setDeepDish(boolean isDeepDish) {
        this.isDeepDish = isDeepDish;
    }
}