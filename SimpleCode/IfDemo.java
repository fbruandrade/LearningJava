class IfDemo {
	public static void main(String[] args) {
		int a, b, c;

		a = 2;
		b = 3;

		if (a < b) {
			System.out.println("a is less than b");
		}

		if (a == b) {
			System.out.println("a is igual b");
		}

		c = a - b;

		System.out.println("C contains -1");
		if (c >= 0) {
			System.out.println("c is non-negative");
		} else {
			System.out.println("c is negative");
		}

		c = b - a;

		System.out.println("C contains 1");
		if (c >= 0) {
			System.out.println("c is non-negative");
		} else {
			System.out.println("c is negative");
		}
	}
}