import java.text.DecimalFormat;

class GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters;
		int counter;

		DecimalFormat formatter = new DecimalFormat("#0.0000");

		counter = 0;

		for (gallons = 1; gallons <= 100; gallons++){
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + formatter.format(liters) + " liters.");

			counter++;

			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}
}