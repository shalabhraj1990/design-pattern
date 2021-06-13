package pattern.design.builder;

public class IglooHouseBuilder implements HouseBuilder {
	private House house;

	public IglooHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasemetn() {
		house.setBasement("IceBars");

	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Ice Blocks");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRroof("Ice Dome");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Ice Dome");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
