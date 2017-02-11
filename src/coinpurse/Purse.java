package coinpurse;

import java.util.List;

import java.util.Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Purse {
	private final int capacity;
	private double balance;
	public List<Coin> money = new ArrayList<Coin>();

	public Purse(int capacity) {
		this.capacity = capacity;
	}

	public int count() {
		return this.money.size();
	}

	public double getBalance() {
		for (int i = 0; i < money.size(); i++) {
			this.balance += money.get(i).getValue();
		}
		return this.balance;
	}

	public int getCapacity() {
		return capacity;
	}

	public boolean isFull() {
		if (this.money.size() < capacity) {
			return false;
		}
		return true;
	}

	public boolean insert(Coin coin) {
		if (this.money.size() < capacity) {
			money.add(coin);
			Collections.sort(this.money);
			return true;
		}
		return false;
	}

	public Coin[] withdraw(double amount) {
		List<Coin> templist = new ArrayList<>();

		for (int i = money.size() - 1; i >= 0; i--) {
			Coin coin = money.get(i);
			if (coin.getValue() <= amount) {
				templist.add(coin);
				amount -= coin.getValue();
			}
		}
		if (amount == 0) {
			for (Coin remove : templist) {
				this.money.remove(remove);
			}
			Coin[] remove = new Coin[templist.size()];
			templist.toArray(remove);
			return remove;
		}
		return null;

	}

	public String toString(){
		return this.capacity + " coin with value " + this.balance;
		}

	public static void main(String[] args) {
		Purse purse = new Purse(5);
		purse.insert(new Coin(10));
		purse.insert(new Coin(5));
		System.out.println(purse.getBalance());
		System.out.println(purse.isFull());
		System.out.println(Arrays.toString(purse.withdraw(15)));
		

	} 
}
