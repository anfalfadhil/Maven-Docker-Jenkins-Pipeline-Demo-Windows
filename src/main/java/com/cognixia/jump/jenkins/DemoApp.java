package com.cognixia.jump.jenkins;

public class DemoApp {
	
    private final String message = "Hello World from our Jenkins Pipeline Demo!! :)";

    public DemoApp() {
    	super();
    }

    public static void main(String[] args) {
        System.out.println(new DemoApp().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
