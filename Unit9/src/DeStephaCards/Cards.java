package DeStephaCards;

public class Cards {
    private String recipientName;
    private double cardPrice;

    public Cards(String recipientName, double cardPrice) {
        this.recipientName = recipientName;
        this.cardPrice = cardPrice;
    }
    public Cards(String recipientName) {
        this.recipientName = recipientName;
        this.cardPrice = 1.0;
    }

    public void greeting() {
        System.out.println("If you are reading this, someone didn’t do their job");
    }

    public String getRecipientName() {
        return recipientName;
    }

    public String getCardPrice() {
        return "This card costs $" + cardPrice;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public void setCardPrice(double cardPrice) {
        this.cardPrice = cardPrice;
    }
}
