import java.text.DecimalFormat;

class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle porche  = new Vehicle();

		DecimalFormat formatter = new DecimalFormat("#0.00");

		double gallons[] = new double[2];
		double dist = 557.8;

		minivan.passenger = 7;
		minivan.fuelcap   = 16;
		minivan.mpg       = 21;

		porche.passenger = 2;
		porche.fuelcap   = 14;
		porche.mpg       = 12;

		gallons[0] = minivan.fuelneeded(dist);;
		System.out.println("To go " + dist + " miles minivan needs " + formatter.format(gallons[0]) + " gallons of fuel.");

		gallons[1] = porche.fuelneeded(dist);;
		System.out.println("To go " + dist + " miles porche needs " + formatter.format(gallons[1]) + " gallons of fuel.");

		System.out.println("DDifference Consumer gallons is: " + (formatter.format(gallons[1] - gallons[0])));
	}
}