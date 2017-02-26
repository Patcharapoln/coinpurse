package coinpurse;

/**
 * Banknote represents coinage (money) with a fixed value and currency.
 * 
 * @author Patcharapol Nirunpornputta
 */
public class BankNote extends AbstractValuable {
	private long serialNumber;
	
	/**
	 * A Banknote with given value currency and serialnumber.
	 * 
	 * @param value of Banknote
	 * 		  currency of Banknote
	 * 		  serialNumber of Banknote
	 */
	public BankNote(double value, String currency, long serialNumber) {
		super(value, currency);
		this.serialNumber = serialNumber;
	}
	
	/**
	 * A Banknote with given value currency.
	 * 
	 * @param value of Banknote
	 * @param currency of Banknote
	 */
	public BankNote(double value, String currency) {
		super(value, currency);
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
	 * @return value , currency and serialnumber of banknote
	 */
	public String toString() {
		return getValue() + "-" + getCurrency()+" note"+ " ["+ this.serialNumber+"]";
	}

}
