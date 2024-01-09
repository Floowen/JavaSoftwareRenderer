package main;

public class Main {

	public static void main(String[] args) {
		Display display = new Display(800, 600, "Java Software Renderer");

		while(true) {
			display.swapBuffers();
		}
		
	}

}
