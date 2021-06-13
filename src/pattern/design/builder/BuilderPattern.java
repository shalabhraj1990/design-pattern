package pattern.design.builder;

public class BuilderPattern {
	public static void main(String[] args) {
		HouseBuilder ignooBuilder = new IglooHouseBuilder();
		DirectorCivilEngineer civilEngineer = new DirectorCivilEngineer(ignooBuilder);
		civilEngineer.contructHouse();
		House house = civilEngineer.getProduct();
		System.out.println(house.toString());

	}
}
