package coinpurse;

import java.util.Comparator;

public class Coinscomparator implements Comparator<Coin> {

	@Override
	public int compare(Coin arg0, Coin arg1) {
		return arg0.getCurrency().compareTo(arg1.getCurrency());
		
	}

}
