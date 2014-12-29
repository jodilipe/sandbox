package dk.jonlind.gof.abstract_factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWidgetFactory {

	@Test
	public void testCreateButton() {
		assertTrue(DarkButton.class.isAssignableFrom(new DarkWidgetFactory().createButton().getClass()));
		assertTrue(LightButton.class.isAssignableFrom(new LightWidgetFactory().createButton().getClass()));
	}

	@Test
	public void testCreateLabel() {
		assertTrue(DarkLabel.class.isAssignableFrom(new DarkWidgetFactory().createLabel().getClass()));
		assertTrue(LightLabel.class.isAssignableFrom(new LightWidgetFactory().createLabel().getClass()));
	}

}
