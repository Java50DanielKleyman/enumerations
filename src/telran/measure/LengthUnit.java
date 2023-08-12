package telran.measure;

public enum LengthUnit {
	MM(1), CM(10), IN(25.4f), FT(304.8f), M(1000), KM(1_000_000);

	float value;

	LengthUnit(float nMillimeters) {
		value = nMillimeters;
	}

	float getValue() {
		return value;
	}

	public Length between(Length length2, Length length1) {
		Length converted1 = length1.convert(this);
		Length converted2 = length2.convert(this);
		float between = Math.abs(converted2.getAmount() - converted1.getAmount());
		Length newLength = new Length(between, this);
		return newLength;
	}
}
