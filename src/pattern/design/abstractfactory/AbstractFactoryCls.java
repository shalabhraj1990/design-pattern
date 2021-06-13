package pattern.design.abstractfactory;

public class AbstractFactoryCls {
	public IRenderUi getUI(int value) {
		if(value == 0)
		{
			return new FactoryText().getText();
		}
		return new FactoryButton().getButton();
	}

}
