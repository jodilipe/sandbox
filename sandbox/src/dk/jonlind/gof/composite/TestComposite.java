package dk.jonlind.gof.composite;

import org.junit.*;

public class TestComposite {

	@Test
	public void test() {
		Picture picture = new Picture();
		picture.add(new Line());
		picture.add(new Text());
		picture.draw();
	}
}
