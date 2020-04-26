package io.github.vikeshpandey;

public class HelloWorld {

	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void init() {
		System.out.println("Bean just got initialized.");
	}

	public void destroy() {
		System.out.println("Bean will get destroyed now.");
	}
}
