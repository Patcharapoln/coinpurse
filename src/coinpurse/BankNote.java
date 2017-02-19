package coinpurse;

/**
 * Banknote represents coinage (money) with a fixed value and currency.
 * 
 * @author Patcharapol Nirunpornputta
 */
public class BankNote implements Valuable {
	/** Value of banknote*/
	private double value;
	/** The currency, of course. */
	private String currency;
	/** serial number of banknote */
	private long serialNumber;
	/** serial number of the next banknote */
	private static long nextSerialNumber = 1000000;
	
	/**
	 * A Banknote with given value using the default currency and serialnumber.
	 * 
	 * @param value of Banknote
	 */
	public BankNote(double value) {
		this.value = value;
		this.serialNumber=BankNote.nextSerialNumber;
		this.currency = "Baht";
		BankNote.nextSerialNumber++;
	}

	/**
	 * A Banknote with given value currency and serialnumber.
	 * 
	 * @param value of Banknote
	 * @param currency of Banknote
	 */
	public BankNote(double value, String currency) {
		this.value = value;
		this.currency = currency;
		this.serialNumber=BankNote.nextSerialNumber;
		BankNote.nextSerialNumber++;

	}

	/**
	 * Get serialnumber of banknote
	 * @return a serialnumber of banknote
	 */
	public long getSerialNumber() {
		return this.serialNumber;
	}
	
	/**
	 * set serialnumber of banknote
	 * @return
	 */
	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	/**
	 * Get value of banknote
	 * @return value of banknote
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * Get currency of banknote
	 * @return currency of banknote
	 */
	@Override
	public String getCurrency() {
		return currency;
	}

	/**
	 * Check a value and currency of two banknotes. They are equal when have same
	 * value and currency
	 * 
	 * @return true when two banknotes are equal , else return false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj.getClass() != this.getClass()) {
			return true;
		}
		BankNote other = (BankNote) obj;
		if (currency.equals(other.currency) && this.value == value)
			return true;
		return false;
	}

	/**
	 * @return value , currency and serialnumber of banknote
	 */
	public String toString() {
		return this.value + "-" + this.currency+" note"+ " ["+ this.serialNumber+"]";
	}
}
