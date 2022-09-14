public class Worker {
    private String name;
    private double hoursWorked, payRate, federalTaxWithholdingRate, stateTaxWithholdingRate;
    private double grossPay, federalWithholding, stateWithholding, totalDeduction, netPay;

    public Worker(String nameInput, double hoursWorkedInput, double payRateInput, double federalTaxWithholdingRateInput, double stateTaxWithholdingRateInput) {
        name = nameInput;
        hoursWorked = hoursWorkedInput;
        payRate = payRateInput;
        federalTaxWithholdingRate = federalTaxWithholdingRateInput;
        stateTaxWithholdingRate = stateTaxWithholdingRateInput;

        grossPay = hoursWorkedInput * payRateInput;
        federalWithholding = grossPay*(federalTaxWithholdingRate/100);
        stateWithholding = grossPay*(stateTaxWithholdingRate/100);
        totalDeduction = federalWithholding + stateWithholding;
        netPay = grossPay - totalDeduction;
    }

    public void printUser() {
        System.out.println("\nEmployee Name: " + name);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + payRate);;
        System.out.println("Gross Rate: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("\tFederal Withholding ("+federalTaxWithholdingRate+"%): $" + federalWithholding);
        System.out.println("\tState Withholding ("+stateTaxWithholdingRate+"%): $" + stateWithholding);
        System.out.println("\tTotal Deduction: $" + totalDeduction);
        System.out.println("Net Pay: $" + netPay);
    }
}
