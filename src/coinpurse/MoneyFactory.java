package coinpurse;

import java.util.ResourceBundle;

public abstract class MoneyFactory {

	private static MoneyFactory factory;
	protected long nextSerialNumber = 1000000;

	public static MoneyFactory getInstance() {
		return factory;
	}

	public abstract Valuable createMoney(double value) throws IllegalArgumentException;

	public Valuable createMoney(String value) throws IllegalArgumentException{
		try {
			double dvalue = Double.parseDouble(value);
			return createMoney(dvalue);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static void setMoneyFactory(MoneyFactory factory) {
		MoneyFactory.factory = factory;
	}

}
