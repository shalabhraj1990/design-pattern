package pattern.design.builder;

public class House implements HousePlan {
 private String basement;
 private String structure;
 private String roof;
 private String interior;
	@Override
	public void setBasement(String basement) {
		// TODO Auto-generated method stub
		this.basement = basement;
	}

	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
				+ "]";
	}

	@Override
	public void setStructure(String structure) {
		// TODO Auto-generated method stub
		this.structure = structure;
	}

	@Override
	public void setRroof(String roof) {
		// TODO Auto-generated method stub
		this.roof = roof;
	}

	@Override
	public void setInterior(String interior) {
		// TODO Auto-generated method stub
		this.interior = interior;
	}

}
