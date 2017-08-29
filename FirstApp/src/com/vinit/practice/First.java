package com.vinit.practice;

public class First {
}

class Car{
	void print(){
		System.out.println("Audi");
	}
}

class Tomato{
	public static void main(String[] args) {
		System.out.println("HEllo JAVA");
		int a =4;
		int b = 7;
		System.out.println(a+b);
		
		//Car car = new Car();
		//car.print();
		new Tomato().next();;
		
		
	}
	public static void next() {
		System.out.println("HEllo JAVA");
		int a =4;
		int b = 7;
		System.out.println(a+b);
		
		Car car = new Car();
		car.print();
	}
}