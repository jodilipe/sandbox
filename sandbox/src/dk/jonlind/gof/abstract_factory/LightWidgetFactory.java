package dk.jonlind.gof.abstract_factory;

public class LightWidgetFactory extends WidgetFactory {

	@Override
	public LightButton createButton() {
		return new LightButton();
	}

	@Override
	public LightLabel createLabel() {
		return new LightLabel();
	}

}
