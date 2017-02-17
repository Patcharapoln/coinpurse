package coinpurse;

public class BankNote implements Valuable {
	private final double value;
	private final String currency;
	private static long serialNumber;
	private static long nextSerialNumber = 1000000;

	public BankNote(double value) {
		this.value = value;
		this.currency = "Baht";
	}

	public BankNote(double value, String currency) {
		this.value = value;
		this.currency = currency;

	}

	public long getSerial() {
		return serialNumber;
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
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return true;
		}
		BankNote other = (BankNote) obj;
		if (currency.equalsIgnoreCase(other.currency) && this.value == value)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return this.value + "-" + this.currency;
	}
}
