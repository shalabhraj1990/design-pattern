package pattern.design.abstractfactory;

public class FactoryText {
	public IRenderUi getText() {
		return new ClsText();
	}
}
