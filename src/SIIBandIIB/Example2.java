package SIIBandIIB;
/*

Instance Initialization Block (IIB)

The movement you create object of class IIB will get loaded.
It will get executed as per object. If we create 10 object IIB will get executed 10 times.
IIB we are able take both Static and Non Static method.

*/

public class Example2 {

static {
System.out.println("I am from SIB block 1");
}

static {
System.out.println("I am from SIB block 2");
}

{
System.out.println("I am from IIB block 1");
}



{
System.out.println("I am from IIB block 2");
}

public static void main(String[] args) {

System.out.println("By default SIB block will execute automatically as soon as class get loaded to memory");
	
System.out.println("*********Object 1*********");
// creating object of class.
Example2 obj= new Example2();
		
	
System.out.println("*********Object 2*********");

Example2 obj1= new Example2();
	
System.out.println("*********Object 3*********");

Example2 obj2= new Example2();
	
System.out.println("*********Object 4*********");

Example2 obj3= new Example2();
	
		
}}
