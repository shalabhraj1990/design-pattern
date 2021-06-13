package pattern.design.builder;

public interface HouseBuilder {
	void buildBasemetn();

	void buildStructure();

	void buildRoof();

	void buildInterior();

	House getHouse();
}
