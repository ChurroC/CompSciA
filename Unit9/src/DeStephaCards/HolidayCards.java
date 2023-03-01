package DeStephaCards;

public class HolidayCards extends Cards {

    public HolidayCards(String recipientName, double cardPrice) {
        super(recipientName, cardPrice);
    }

    @Override
    public void greeting() {
        System.out.println("Dear " + this.getRecipientName() + ", Happy Holidays");
    }
}
