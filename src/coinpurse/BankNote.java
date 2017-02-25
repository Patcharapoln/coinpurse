package coinpurse;

/**
 * Banknote represents coinage (money) with a fixed value and currency.
 * 
 * @author Patcharapol Nirunpornputta
 */
public class BankNote extends AbstractValuable {
	private long serialNumber;
	/** serial number of the next banknote */
	private static long nextSerialNumber = 1000000;
	
	
	/**
	 * A Banknote with given value using the default currency and serialnumber.
	 * 
	 * @param value of Banknote
	 */
	public BankNote(double value) {
		super(value);
		this.serialNumber=BankNote.nextSerialNumber;
		BankNote.nextSerialNumber++;
	}

	/**
	 * A Banknote with given value currency and serialnumber.
	 * 
	 * @param value of Banknote
	 * @param currency of Banknote
	 */
	public BankNote(double value, String currency) {
		super(value,currency);
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
	 * @return value , currency and serialnumber of banknote
	 */
	public String toString() {
		return getValue() + "-" + getCurrency()+" note"+ " ["+ this.serialNumber+"]";
	}

}
