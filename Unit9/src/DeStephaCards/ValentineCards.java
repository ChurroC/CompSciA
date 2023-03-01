package DeStephaCards;

public class ValentineCards extends HolidayCards{
    private int num_kisses;

    public ValentineCards(String recipientName, double cardPrice, int num_kisses) {
        super(recipientName, cardPrice);
        this.num_kisses = num_kisses;
    }

    @Override
    public void greeting() {
        System.out.println("Dear " + this.getRecipientName() + ", Love and Kisses " + "xo".repeat(this.num_kisses));
    }
}
