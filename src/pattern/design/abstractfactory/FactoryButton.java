package pattern.design.abstractfactory;

public class FactoryButton {
	public IRenderUi getButton() {
		return new ClsButton();
	}

}
