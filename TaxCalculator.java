import java.util.Scanner;

//Constants for the taxes that are used.
public class TaxCalculator {
	final static double FIRST_TAX = 0.0;
	final static double SECOND_TAX = 0.1;
	final static double THIRD_TAX = 0.2;
	final static double FOURTH_TAX = 0.4;
	final static double FIFTH_TAX = 0.6;
	final static double SIXTH_TAX = 1.2;

	public double remainingIncome(double initial, double payable) {
		return (initial - payable);

	}

	// A method that uses the if statement that returns the tax that you have to pay in a given income.
	public double payableTax(double income) {

		if (income >= 1825) {// At 1825 the income will be the same as the tax you have to pay.
			
		} else if (income <= 100) {
			income *= FIRST_TAX;
		} else if (income >= 101 && income <= 150) {
			income = SECOND_TAX * (income - 100);
		} else if (income >= 151 && income <= 200) {
			income = (THIRD_TAX * (income - 150)) + (SECOND_TAX * 50);
		} else if (income >= 201 && income <= 300) {
			income = (FOURTH_TAX * (income - 200)) + (SECOND_TAX * 50) + (THIRD_TAX * 50);
		} else if (income >= 301 && income <= 400) {
			income = (FIFTH_TAX * (income - 300)) + (SECOND_TAX * 50) + (THIRD_TAX * 50) + (FOURTH_TAX * 100);
		} else if (income > 400) {
			income = (SIXTH_TAX * (income - 400)) + (SECOND_TAX * 50) + (THIRD_TAX * 50) + (FOURTH_TAX * 100)
					+ (FIFTH_TAX * 100);
		}
		return Math.round(income);

	}

	// This is a scanner method that whenever a value is inputed it will return to me the tax payable and the deducted income.
		public static void main(String[] args) {

		System.out.println("Enter your income:");
		TaxCalculator tc = new TaxCalculator();
		Scanner sc = new Scanner(System.in);
		double income = sc.nextDouble();
		double initialIncome = income;

		double newtaxrate = tc.payableTax(income);
		System.out.println("Your tax payable is " + (int) newtaxrate + ".");
		double remainingInc = tc.remainingIncome(initialIncome, newtaxrate);
		System.out.println("Your deducted income  is " + (int) remainingInc + ".");

		sc.close();
	}
}
