package MethodOverloading;

public class Example2{
	//Rule = Method Overloading by changing "sequence of argument".
		
	void test() {
	System.out.println("test()");
	}

	void test(int a) {
	System.out.println("test(int a)");
	}

	void test(int a , double b) {
	System.out.println("test(int a , double b)");
	}

	void test(double a , int b) {
	System.out.println("test( double a , int b)");
	}
	public static void main(String[] args) {
	Example2 ob = new Example2();
	ob.test();
	ob.test(4);
	ob.test(4 ,4.4);
	ob.test(4.4 , 4);
	}
	}

