class MyClass {
	int x;

	MyClass(int i) {
		this.x = i;
	}
}

class ParmDemo {
	public static void main(String[] args) {
		ChkNum chk = new ChkNum();
		int i;

		for (i = 0; i < 10; i++) {
			if (chk.isEven(i)){
				System.out.println(i + " is Even");
			} else {
				System.out.println(i + " is NOT Even");
			}
		}

		System.out.println("\n");
		MyClass my = new MyClass(25);
		System.out.println("My is "+ my.x);
	}
}