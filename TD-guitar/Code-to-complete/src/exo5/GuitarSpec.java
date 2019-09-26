package exo5;

public class GuitarSpec {

	public static final int NO_PREF_NUM_STRINGS = 0;
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
	
	public boolean matches(GuitarSpec specs) {
		if (specs.getBuilder() == null || specs.getBuilder()== this.getBuilder()) {
			if(specs.getModel()== null || specs.getModel() == this.getModel()) {
				if(specs.getType() == null || specs.getType()== this.getType()) {
					if(specs.getBackWood()== null || specs.getBackWood()==this.getBackWood()) {
						if(specs.getTopWood()== null || specs.getTopWood()== this.getTopWood()) {
							if(specs.getNumStrings()== GuitarSpec.NO_PREF_NUM_STRINGS || specs.getNumStrings()== this.getNumStrings()) {
								return true;
							}
						}
					}
				}
			}
			
		}
		return false;
	}
	
	
	
}
