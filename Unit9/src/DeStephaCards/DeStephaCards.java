package DeStephaCards;

public class DeStephaCards {
    public static void main(String[] args) {
        HolidayCards holidayCard = new HolidayCards("Charan", 2.0);
        holidayCard.greeting();

        BirthdayCards birthdayCard = new BirthdayCards("Charan", 2.0, 21);
        birthdayCard.greeting();

        ValentineCards valentineCard = new ValentineCards("Charan", 3.0, 3);
        valentineCard.greeting();
    }
}
