package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100_000.00;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTaxAmount , federalTaxAmount , totalTaxAmount, salaryAfterTax;
        stateTaxAmount = salary * stateTaxRate;
        federalTaxAmount = salary * federalTaxRate ;
        totalTaxAmount = stateTaxAmount + federalTaxAmount ;
        salaryAfterTax = salary - totalTaxAmount ;
        String taxReport = "Tax Info: \n\tBase Salary:\t  " + salary + "\n\tState tax rate:\t  " + stateTaxRate + "\n\tFederal Tax Rate: " + federalTaxRate + "\n\t-----------------------\n\tAfter Tax: $ " + salaryAfterTax;
        System.out.println(taxReport);

    }
}
