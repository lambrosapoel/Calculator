
public class TaxChart {
	// this is the array which will store the incomes from the taxTables method.
	// to use for the creation of the Bar chart.
	int[] incomes;

	// this is my constructor with one parameter.
	public TaxChart(int[] arr) {
		this.incomes = arr;

	}

	// This method neatly prints a table of the of the Net Income and the Tax Paid corresponding to my chart.
	public void printTable() {
		System.out.println("NetIncome:\tTaxPaid:");
		System.out.println("************************");
		TaxCalculator taxCalc = new TaxCalculator();
		for (int i = 0; i < incomes.length; i++) {
			System.out.println((int) taxCalc.remainingIncome(incomes[i], taxCalc.payableTax(incomes[i])) + "\t\t"
					+ (int) taxCalc.payableTax(incomes[i]));
		}
	}

	// This is the draw method. It draws thin Bars based of the values in the array.
	public void drawChart() {

		TaxCalculator taxCalc = new TaxCalculator();

		// I created an x and y bar changed their size and made them visible.
		Bar xPosition = new Bar();
		Bar yPosition = new Bar();
		xPosition.moveHorizontal(-30);
		xPosition.changeSize(230, 1);
		xPosition.moveVertical(200);
		xPosition.changeColour(Colour.BLUE);
		xPosition.makeVisible();
		yPosition.changeSize(1, 220);
		yPosition.makeVisible();
		yPosition.moveHorizontal(-10);
		yPosition.changeColour(Colour.BLUE);

		// i create a loop for the incomes to be used for the remaningHeight and taxHeight of the bars.
		for (int i = 0; i < incomes.length; i++) {

			int width = 5;
			int remaningHeight = (int) taxCalc.remainingIncome(incomes[i], taxCalc.payableTax(incomes[i])) / 3;
			int taxHeight = (int) taxCalc.payableTax(incomes[i]) / 3;
			Bar remainingBar = new Bar();
			Bar taxBar = new Bar();

			remainingBar.makeVisible();
			remainingBar.changeColour(Colour.YELLOW);
			remainingBar.moveVertical(200 - remaningHeight);
			remainingBar.moveHorizontal(10 * i);
			remainingBar.changeSize(width, remaningHeight);

			taxBar.changeSize(width, taxHeight);
			taxBar.makeVisible();
			taxBar.changeColour(Colour.RED);
			taxBar.moveVertical(200 - taxHeight - remaningHeight);
			taxBar.moveHorizontal(10 * i);

		}

	}
}
