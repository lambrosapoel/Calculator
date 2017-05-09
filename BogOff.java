public class BogOff {

	// this method declares an array of integers and calls the method to draw a chart and a table.
	public static void taxTables() {
		int incomes[] = { 25, 50, 100, 125, 150, 175, 200, 225, 250, 275, 300, 325, 350, 375, 400, 425, 450, 500, 550 };
		TaxChart tc = new TaxChart(incomes);
		tc.drawChart();
		tc.printTable();

	}

	public static void main(String[] args) {
		taxTables();
	}
}
