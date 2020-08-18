package MethodOverloading;

/*
Question1 )  Is it possible overloading by Static , Final and Main() method?
Yes.
 */
public class Example4 {
	
static void test() {
System.out.println("static void test()");
}

static void test(int a) {
System.out.println("static void test(int a)");
}

final void test1() {
System.out.println("final void test1()");
}

final void test1(int a) {
System.out.println("final void test1()");
}

public static void main(String[] args) {

Example4 ob = new Example4();
ob.test();
ob.test(2);
ob.test1();
ob.test1(5);

	}

}
