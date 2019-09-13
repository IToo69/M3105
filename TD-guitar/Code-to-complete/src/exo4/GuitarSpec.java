package exo4;

public class GuitarSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		super();
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backwood, Wood topWood) {
		this(builder, model, type, backwood, topWood);
		this.numStrings = numStrings;
	}

	public Builder getBuilder() {
		return builder;
	}
	
	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings() {
		return numStrings;
	}
	
}
