public class FloatEqu {
	final static double TOLERANCE = 0.001;
	public static void main(String[] args) {
		
		double x = (1.0/10) * (1.0/10);
		double y = (1.0/100);
		
		if (x==y) {
			System.out.println("EQUAL");
		} else if (Math.abs(x-y)<TOLERANCE) {
			System.out.println("APPROXIMATELY EQUAL WITHIN" + TOLERANCE);
		} else {
			System.out.println("NOT EQUAL");
		}

	}

}

//After running the program and having it output NOT EQUAL was surprising.