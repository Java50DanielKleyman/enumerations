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
	public Length between(Length length1, Length length2) {
		return length2.getAmount() - length1.getAmount();
	}
}
