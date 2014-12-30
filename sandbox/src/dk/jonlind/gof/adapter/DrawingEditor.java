package dk.jonlind.gof.adapter;

import java.util.*;

/**
 * Client
 */
public class DrawingEditor {

	public void draw(List<Shape> shapes) {
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
