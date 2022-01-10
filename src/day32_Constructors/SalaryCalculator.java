package day32_Constructors;

public class SalaryCalculator {

    public double hourlyRate,stateTaxRate,federalTaxRate,weeklyHours;

    public SalaryCalculator(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        double salary= hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax(){
        double totalStateTax=salary()*stateTaxRate/100;
        return totalStateTax;
    }
    public double federalTax() {
        double totalFedTax = salary() * federalTaxRate / 100;
        return totalFedTax;
    }
    public double salaryAfterTax(){
        double netSalary=salary()-stateTax()-federalTax();
        return netSalary;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary = $" + salary() +
                ", stateTax = $" + stateTax() +
                ", federalTax = $" + federalTax() +
                ", salaryAfterTax = $" + salaryAfterTax() +
                '}'
                ;
    }
}

/*
SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the total stateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */