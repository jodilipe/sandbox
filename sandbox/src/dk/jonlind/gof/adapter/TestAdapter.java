package dk.jonlind.gof.adapter;

import java.util.*;

import org.junit.*;

public class TestAdapter {

	@Test
	public void test() {
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Triangle());
		shapes.add(new TextShape(new TextView()));
		new DrawingEditor().draw(shapes);
	}
}
