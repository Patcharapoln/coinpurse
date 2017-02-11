package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * 
 * @author Patcharapol Nirunpornputta
 */

public class Coin implements Comparable<Coin> {
	/** Value of the coin. */
	private final double value;
	private static final String DEFAULT_CURRENCY = "Baht";
	/** The currency, of course. */
	private final String currency;

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 */
	public Coin(double value) {
		this.value = value;
		this.currency = DEFAULT_CURRENCY;

	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;

	}

	/**
	 * Get a value of coin.
	 * 
	 * @return value of coin
	 */
	public double getValue() {
		return value;
	}

	/**
	 * Get a currency of coin.
	 * 
	 * @return currency of coin
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * Check a value and currency of two coins. They are equal when have same
	 * value and currency
	 * 
	 * @return true when two coins are equal , else return false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != this.getClass())
			return false;
		Coin other = (Coin) obj;
		if (currency.equalsIgnoreCase(other.currency) && this.value == other.value)
			return true;
		return false;
	}

	/**
	 * Order coin by value a smallest value come first
	 * 
	 * @param other
	 *            is other coin that you want to compare
	 * @return -1 when other coin is null and other coin have more value than
	 *         first coin 
	 *         1 when first coin have more value than other coin 
	 *         0 when first coin and other coin are equal
	 */
	public int compareTo(Coin other) {
		if (other == null)
			return -1;
		if (this.value < other.value) {
			return -1;
		}
		if (this.value > other.value) {
			return 1;
		}
		return 0;

	}

	/**
	 * @return value and currency of coins
	 */
	public String toString() {
		return this.value + "-" + this.currency;
	}
}
