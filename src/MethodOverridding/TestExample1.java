package MethodOverridding;

public class TestExample1 extends Example1 {
	public void test1() {
		System.out.println("Child class Example2 having Public method as test1()");
		}
		
		protected void test2() {
		System.out.println("Child class Example2 having Protected method as test2()");
		}

		private void test3() {
		System.out.println("Child class Example2 having Private method as test3()");
		}
		
		void test4() {
		System.out.println("Child class Example2 having Default method as test4()");
		}
		
		static void test5() {
		System.out.println("Child class Example2 having Static method  as test5()");
		}
		/*
		 Rule => final method if defined in parent class that we cannot write required code for child class as 
       compile time error occurs. Hence commenting below piece of code.
       
		final void test6() {
			System.out.println("Child class Example2 having Final method as test6()");
		}
      */
	public static void main(String[] args) {
	
		System.out.println("*****Scenario of reference and object of child class*****");
		TestExample1 ob = new TestExample1();
		ob.test1();
		ob.test2();
		ob.test3();
		ob.test4();
		ob.test5();
		ob.test6();
		
        System.out.println("*****Scenario of reference and  object of parent class*****");
		//Rule => We cannot call private method from parent class reference and object. eg test 3();

        Example1 ob1 = new Example1();
        ob1.test1();
        ob1.test2();
        //ob1.test3(); private method can not be called.
        ob1.test4();
        ob1.test5();
        ob1.test6();
        
        
        System.out.println("*****Scenario reference of parent class and  object of child class*****");

		/*Rule => a)  We cannot call private method from parent class reference and object of child class. eg test 3() 
		          b) Static method is strictly called from parent class. 
		          c) However public ,Protected and default methods are called from child class.
		*/
        Example1 ob2 = new TestExample1();
        
        ob2.test1();
        ob2.test2();
        // ob2.test3(); private method can not be called.
        ob2.test4();
        ob2.test5(); // Static method is strictly called from parent class.
        ob2.test6();
        
        
	}

}
