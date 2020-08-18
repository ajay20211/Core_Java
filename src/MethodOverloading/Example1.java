package MethodOverloading;

public class Example1 {
	// Rule = Method Overloading by changing "Type of argument".
		
		
	void test() {
		System.out.println("test()");
	}

	void test(int a) {
		System.out.println("test(int a)");
	}

	void test (int a , int b) {
		System.out.println("test(int a , int b");
	}

	void test(double a) {
		System.out.println("test(double a)");
	}

	void test(double a , double b) {
		System.out.println("test(double a , double b)");
	}
		public static void main(String[] args) {
		Example1 ob = new Example1();
		ob.test();
		ob.test(9);
		ob.test(9,9);
		ob.test(9.9);
		ob.test(9.9 ,9.9);

		}

	}
