package pattern.design.factory;

public class FactoryHeaders {
	public IHeaders callFatoryPattern(int type) {
		IHeaders headers;
		if (type == 0) {
			headers = new ClassWithOutHeaders();
		} else
			headers = new ClassWithHeaders();
		return headers;
	}
}
