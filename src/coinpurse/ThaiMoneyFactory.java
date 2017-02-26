package coinpurse;

public class ThaiMoneyFactory extends MoneyFactory {
	/**Currency of Thai money*/
	private String currency = "Baht";

	/**
	 * Create Thai coin and Banknote
	 * 
	 * @param value = value of money
	 * @return thai coin,banknote with input value
	 * @throws IllegalArgumentException if value is not valid
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value == 1 || value == 2 || value == 5 || value == 10) {
			return new Coin(value, currency);
		} else if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000) {
			return new BankNote(value, currency,this.nextSerialNumber++);
		} else
			throw new IllegalArgumentException();
	}

}