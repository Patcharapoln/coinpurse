package coinpurse;

public abstract class AbstractValuable implements Valuable {
	private double value;
	protected String currency;
	protected static final String DEFAULT_CURRENCY = "Baht";

	public AbstractValuable(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	public AbstractValuable(double value) {
		this.value = value;
		this.currency = DEFAULT_CURRENCY;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return true;
		}
		Valuable other = (Valuable) obj;
		if (currency.equals(other.getCurrency()) && this.value == value)
			return true;
		return false;
	}

	@Override
	public double getValue() {
		return value;
	}

	@Override
	public String getCurrency() {
		return currency;
	}

	@Override
	public int compareTo(Valuable other) {
		if (other == null)
			return -1;
		if (this.value < other.getValue()) {
			return -1;
		}
		if (this.value > other.getValue()) {
			return 1;
		}
		return 0;

	}

}
