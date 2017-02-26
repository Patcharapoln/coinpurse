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

	
	

	

}
