package coinpurse;

import java.util.Comparator;

/**
 * Compare a currency of two coins
 * 
 * @author Patcharapol Nirunpornputta
 */
public class Coinscomparator implements Comparator<Coin> {

	/**
	 * Uses to sort currency of coin
	 * 
	 * @param first is first coin
	 * 		  second is second coin
	 * @return alphabetize currency
	 */
	@Override
	public int compare(Coin first, Coin second) {
		return first.getCurrency().compareTo(second.getCurrency());
		
	}

}
