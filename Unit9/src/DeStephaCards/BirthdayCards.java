package DeStephaCards;

public class BirthdayCards extends Cards {
    private int age;

    public BirthdayCards(String recipientName, double cardPrice, int age) {
        super(recipientName, cardPrice);
        this.setCardPrice(2.0);
        this.age = age;
    }

    @Override
    public void greeting() {
        System.out.println("Happy " + this.age + " Birthday");
    }
}
