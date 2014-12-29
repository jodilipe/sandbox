package dk.jonlind.gof.abstract_factory;

public class DarkWidgetFactory extends WidgetFactory {

	@Override
	public DarkButton createButton() {
		return new DarkButton();
	}

	@Override
	public DarkLabel createLabel() {
		return new DarkLabel();
	}

}
