package com.exceptionhandling;

class Amount {
	private String currency;
	private int ammount;

	public Amount(String currency, int ammount) {
		super();
		this.currency = currency;
		this.ammount = ammount;
	}

	public void add(Amount that) {
		if (!this.currency.equals(that.currency)) {
			throw new RuntimeException("Currencies Dont Match");
		}

		this.ammount += that.ammount;

	}

	@Override
	public String toString() {
		return ammount + " " + currency;
	}

}
public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Amount amount1 = new Amount("USD", 30);
		Amount amount2 = new Amount("USD", 30);

		amount1.add(amount2);

		System.out.println(amount1);

	}

}
