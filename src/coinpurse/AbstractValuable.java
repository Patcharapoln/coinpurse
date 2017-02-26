package coinpurse;

/**
 * An abstract class for project to avoid duplicate code with valuable interface
 * 
 * @author Patcharapol Nirunpornputta
 *
 */
public abstract class AbstractValuable implements Valuable {
	/** value of money */
	private double value;
	/** currency of money */
	protected String currency;
	/** Default currency of money */
	protected static final String DEFAULT_CURRENCY = "Baht";

	/**
	 * Initialize a AbstractValuable with given value and currency.
	 * 
	 * @param value of money
	 * @param currency of money
	 */
	public AbstractValuable(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	/**
	 * Check a value and currency of two coins or banknotes. They are equal when
	 * have same value and currency
	 * 
	 * @return true when two items are equal , else return false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Valuable other = (Valuable) obj;
		return (this.getValue() == other.getValue()) && (this.getCurrency() == other.getCurrency());
	}

	/**
	 * Get the value of this object
	 * 
	 * @return value of this object
	 */
	@Override
	public double getValue() {
		return value;
	}

	/**
	 * Get the currency of this object
	 * 
	 * @return currency of this object
	 */
	@Override
	public String getCurrency() {
		return currency;
	}

	/**
	 * Compare this item to other
	 * 
	 * @return < 0 if this value is less than other value 
	 * 		   = 0 if this value equals other value 
	 * 		   > 0 if this value is more than other value
	 */
	@Override
	public int compareTo(Valuable other) {
		if (this.getCurrency().equals(other.getCurrency())) {
			return (int) Math.signum(this.getValue() - other.getValue());
		} else if (other == null) {
			return -1;
		} else
			return this.getCurrency().compareTo(other.getCurrency());
	}

}
