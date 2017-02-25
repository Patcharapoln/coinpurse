package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * 
 * @author Patcharapol Nirunpornputta
 */

public class Coin extends AbstractValuable{
	
		
	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 */
	public Coin(double value) {
		super(value);
	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 * @param currency
	 */
	public Coin(double value, String currency) {
		super(value,currency);

	}

	/**
	 * @return value and currency of coins
	 */
	@Override
	public String toString() {
		if(super.getCurrency().equals("Ringgit")){
			return getValue() + "-" + "Sen coin";
		}
		return getValue() + "-" + getCurrency();
	}
	
	

}
