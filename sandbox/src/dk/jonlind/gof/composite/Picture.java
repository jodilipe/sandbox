package dk.jonlind.gof.composite;

import java.util.*;

/**
 * Composite
 */
public class Picture extends Graphic {
	private List<Graphic> graphics = new ArrayList<Graphic>();

	public void add(Graphic graphic){
		this.graphics.add(graphic);
	}
	
	@Override
	public void draw() {
		for (Graphic graphic : graphics) {
			graphic.draw();
			System.out.println(graphic.getClass().getSimpleName() + " drawn");
		}
	}

}
