package dk.jonlind.gof.adapter;

/**
 * Adaptee
 * Existing toolkit class that needs to be adapted to use the Shape Interface 
 */
public class TextView {

	public void render() {
		System.out.println("TextView rendered");
	}
}
