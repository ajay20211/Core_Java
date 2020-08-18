package MethodOverridding;



public class TestExample extends Example{
	
	
	void test2() {
	System.out.println("Child class having method test2()");
	}

	void test3() {
	System.out.println("Child class having method test3()");
	}
	public static void main(String[] args) {
	
	System.out.println("***** Reference and object of child class *****");
	TestExample ob = new TestExample();
	ob.test1();
	ob.test2();
	ob.test3();
	
	System.out.println("**** Reference and object of Parent class *****");
	Example ob1 = new Example();
	ob1.test1();
	ob1.test2();
	// Note = test3(); cannot be called by parent class object as this method (test3()) is not defined in parent class.
	
	System.out.println("***** Reference of parent class and object of Child class *****");
	Example ob2 = new TestExample();
	ob2.test1();
	ob2.test2();
	// Note = test3() method cannot be displayed for parent class reference . Since this method (test3()) does not exist in parent class.
	}

}
