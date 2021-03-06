package coinpurse;

import java.util.Comparator;

/**
 * Compare a currency of two coins
 * 
 * @author Patcharapol Nirunpornputta
 */
public class CurrencyComparator implements Comparator<Valuable> {

	/**
	 * Uses to sort currency of coin
	 * 
	 * @param first is first coin
	 * 		  second is second coin
	 * @return alphabetize currency
	 */
	@Override
	public int compare(Valuable first, Valuable second) {
		return first.getCurrency().compareToIgnoreCase(second.getCurrency());
		
	}

}
