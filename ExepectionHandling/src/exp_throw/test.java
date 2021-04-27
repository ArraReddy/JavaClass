public class test {

	void Exep1() {
		throw new ArrayIndexOutOfBoundsException();
	}

	void Exep2() {
		Exep1();
	}

	void Exep3() {
		Exep2();
	}

	void tryCatch() {
		try {
			Exep3();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("From tryCatch " + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test obj = new test();
		obj.tryCatch();

	}

}
