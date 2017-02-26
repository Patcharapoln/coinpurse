package coinpurse;

public class MalayMoneyFactory extends MoneyFactory {
	/** Malaysia money currency */
	private String currency = "Ringgit";
	
	/**
	 * Create Malaysia coin and Banknote
	 * 
	 * @param value = value of money
	 * @return Malaysia coin,banknote with input value
	 * @throws IllegalArgumentException if value is not valid
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value == 0.05 || value == 0.1 || value == 0.2 || value == 0.5) {
			return new Coin(value, currency);
		} else if (value == 1 || value == 2 || value == 5 || value == 10 || value == 50 || value == 100) {
			return new BankNote(value, currency,this.nextSerialNumber++);
		}
		throw new IllegalArgumentException();
	}

}
