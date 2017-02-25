package coinpurse;

/**
 * An interface for objects having a monetary value and currency
 * 
 * @author Patcharapol Nirunpornputta
 *
 */
public interface Valuable extends Comparable<Valuable>{
	/**
	 * Get the value of this object
	 * 
	 * @return value of this object
	 */
	public double getValue();

	/**
	 * Get the currency of this object
	 * 
	 * @return currency of this object
	 */
	public String getCurrency();

	/**
	 * return value and currency of this object
	 * 
	 * @return value and currency of this object
	 */
	public String toString();

	/**
	 * Check a value and currency of two coins or banknotes. They are equal when
	 * have same value and currency
	 * 
	 * @return true when two coins or banknotes are equal , else return false
	 */
	public boolean equals(Object other);

	public int compareTo(Valuable other);
}
