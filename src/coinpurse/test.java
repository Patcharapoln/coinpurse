package coinpurse;

public class test {
	public static void main(String[] args) {
		
		try {
			Double.parseDouble("s");
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException();
		}
	}
}
