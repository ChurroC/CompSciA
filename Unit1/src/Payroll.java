import java.util.Scanner;

public class Payroll {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("How many hours have you worked this week? ");
        double hoursWorked = input.nextDouble();
        System.out.print("What is your hourly pay rate? ");
        double payRate = input.nextDouble();
        System.out.print("What is your federal tax withholding rate? ");
        double federalTaxWithholdingRate = input.nextDouble();
        System.out.print("What is your state tax withholding rate? ");
        double stateTaxWithholdingRate = input.nextDouble();

        Worker employeeOne = new Worker(name, hoursWorked, payRate, federalTaxWithholdingRate, stateTaxWithholdingRate);
        employeeOne.printUser();
    }
}
