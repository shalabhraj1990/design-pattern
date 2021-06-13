package pattern.design.factory;

public class FactoryPattern {
//1)lot of scattered new keyword <==> solved by introducing Factory class
	//2) client is aware of all class object <==> solved by introducing Interface
	public static void main(String[] args) {
		IHeaders headers =	new FactoryHeaders().callFatoryPattern(0);
		headers.display();
	}

	

}
