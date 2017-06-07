class AddMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle porche  = new Vehicle();

		int range1, range2;

		minivan.passenger = 7;
		minivan.fuelcap   = 16;
		minivan.mpg       = 21;

		porche.passenger = 2;
		porche.fuelcap   = 14;
		porche.mpg       = 12;

		range1 = minivan.range();
		range2 = porche.range();

		System.out.println(range1);
		System.out.println(range2);
	}
}