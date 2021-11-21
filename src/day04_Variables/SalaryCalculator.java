package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //  hourly Rate, weeklyHours

        int hourlyRate = 500;
        int weeklyHours = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;




        //System.out.println(salary);
        // shortcut soutv
        System.out.println("weeklyHours = $" + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);








    }





}
