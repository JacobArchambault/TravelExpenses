package org.jacobarchambault.travelexpenses;

public class Expenses {
	Expense expense1;
	Expense expense2;

	Expenses(Expense expense1, Expense expense2) {
		this.expense1 = expense1;
		this.expense2 = expense2;
	}

	double add(){
		return expense1.amount() + expense2.amount();
	}
}
