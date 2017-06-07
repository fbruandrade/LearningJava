class Vehicle {
	int passenger;
	int fuelcap;
	int mpg;

	int range() {
		return mpg * fuelcap;
	}

	double fuelneeded (double miles) {
		return miles/mpg;
	}
}