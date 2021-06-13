package pattern.design.builder;

public class WoodHouseBuilder implements HouseBuilder {
	private House house;

	public WoodHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasemetn() {
		// TODO Auto-generated method stub
		house.setBasement("Wooden Poles");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Wood ");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRroof("Wood, caribou and seal skins");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Fire Wood");

	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
