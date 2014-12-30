package dk.jonlind.gof.adapter;

/**
 * Adapter
 * Wraps existing toolkit class that needs to be adapted to use the Shape Interface 
 */
public class TextShape extends Shape {
	private TextView textView;

	public TextShape(TextView textView) {
		this.textView = textView;
	}

	@Override
	public void draw() {
		textView.render();
	}
}
