package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate  = 45,
            weeklyHours = 40;

        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;

        //--------------------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;

        double totalTax = stateTax + federalTax;

        double salaryAfterTax = salaryBeforeTax- totalTax;


        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State tax = $" + stateTax);
        System.out.println("Federal tax = $" + federalTax);
        System.out.println("Total tax = $" + totalTax);
        System.out.println("Salary after tax = $" + salaryAfterTax);

        System.out.println("Salary after tax/12 = $" + (salaryAfterTax/12));
        System.out.println("Salary after tax/365 = $" + (salaryAfterTax/365));


    }

}
