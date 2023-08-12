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
		return (int) (getAmount() - o.getAmount());
	}

	public float getAmount() {
		return unit.value * amount;
	}
//public boolean equals(object Object) {
//	
//}

	public Length convert(LengthUnit unit) {
		float amountMM = getAmount(); 
		float amountOfUnits = amountMM / unit.value;
		Length newElement = new Length(amountOfUnits, unit);
		return newElement;
	}

	public LengthUnit getUnit() {
		
		return unit;
	}
}