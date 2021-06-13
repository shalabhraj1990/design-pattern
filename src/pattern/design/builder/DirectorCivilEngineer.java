package pattern.design.builder;

public class DirectorCivilEngineer {
	private HouseBuilder houseBuilder;

	public DirectorCivilEngineer(HouseBuilder houseBuilde) {
		this.houseBuilder = houseBuilde;
	}
	
	public void contructHouse() {
		this.houseBuilder.buildBasemetn();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildRoof();
		this.houseBuilder.buildInterior();
	}
	
	public House getProduct() {
		return this.houseBuilder.getHouse();
	}
}
