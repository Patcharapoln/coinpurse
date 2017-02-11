package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * 
 * @author Bill Gates 6010540000 (that's his net worth, not his id)
 */

public class Coin implements Comparable<Coin> {
	private final double value;
	public static final String DEFAULT_CURRENCY = "Baht";
	private final String currency;

	public Coin(double value) {
		this.value = value;
		this.currency = DEFAULT_CURRENCY;

	}

	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;

	}

	public double getValue() {
		return value;
	}

	public String getCurrency() {
		return currency;
	}

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

	public String toString() {
		return value + " Baht";
	}

	public static void main(String[] args) {

		Coin one = new Coin(1);
		Coin five = new Coin(5);
		System.out.println(one.compareTo(five));
		System.out.print(one.equals(five));
		System.out.println(one.toString());
	}
}
