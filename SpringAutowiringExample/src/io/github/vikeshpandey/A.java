package io.github.vikeshpandey;

class A {
	B b;

	A() {
		System.out.println("a is created");
	}
	
	A(B b) {
		this.b = b;
		System.out.println("a is created with b");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	void print() {
		System.out.println("hello a");
	}

	void display() {
		print();
		b.print();
	}
}
