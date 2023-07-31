package classandObjects;

public class OverLoadingFunction {

	// Method overloading: Poly(many) + Morphism(forms) --> CompileTime(static
	// binding)
	// within the same class if you have multiple methods:
	// 1. with the same name
	// 2. with the different parameters
	// 3. with the different types of parameters
	// 4. with the different sequence/order of the parameters
	// 5. return type does not matter

	public void test() {

	}

	public void test(int x) {

	}

	public int test(int x, char a) {
		int c = 100;
		return c;
	}

	public void test(char x) {

	}

	public void test(String x) {

	}

	public String test(String a, String b) {

		String c = "abc";
		return c;

	}

	public static void main(String[] args) {

	}

}
