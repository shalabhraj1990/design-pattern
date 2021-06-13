package pattern.design.abstractfactory;

public class AbstractFactory {
	public static void main(String[] args) {
		IRenderUi renderui = new AbstractFactoryCls().getUI(1);
		System.out.println(renderui.renderUI());
	}
}
