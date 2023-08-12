package telran.measure;

public class Length implements Comparable<Length> {
	private float amount;
	private LengthUnit unit;

	public Length(float amount, LengthUnit unit) {
		this.unit = unit;
		this.amount = amount;
	}

	@Override
	public int compareTo(Length o) {
		return Float.compare(getAmount(), o.getAmount());
	}

	public float getAmount() {
		return amount;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Length)) {
			return false;
		}
		Length convertedOther = ((Length) obj).convert(getUnit());
		return this.getAmount() == convertedOther.getAmount();
	}

	public Length convert(LengthUnit unit) {
		float amountMM = getAmount();
		float amountOfUnits = amountMM / unit.value;
		Length newElement = new Length(amountOfUnits, unit);
		return newElement;
	}

	public LengthUnit getUnit() {

		return unit;
	}

	public String toString() {
		String amountStr = String.format("%.1f", amount);
		return amountStr + unit.name();
	}
}