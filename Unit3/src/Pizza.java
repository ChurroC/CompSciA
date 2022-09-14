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

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}