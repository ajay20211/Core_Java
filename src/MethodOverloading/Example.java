package MethodOverloading;

//Rule = Example of method overloading by changing number of argument
public class Example {
	
void test1() {
System.out.println("test1()");
}

void test1(int a) {
System.out.println("test1(int a)");

}

void test1(int a , int b) {
System.out.println("test1(int a , int b)");

}

void test1 (int a , int b , int c) {
	System.out.println("test1(int a , int b , int c)");
}

public static void main(String[] args) {
	Example ob = new  Example();
	ob.test1(9);
	ob.test1(9);
	ob.test1(9,9);
	ob.test1(9,9,9);


	}

}
