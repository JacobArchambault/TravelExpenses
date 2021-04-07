package org.jacobarchambault.travelexpenses;

public class Expenses {
	Expense expense1;
	Expense expense2;
	Expense expense3;
	Expense expense4;
	Expense expense5;
	Expense expense6;
	Expense expense7;

	Expenses(
			Expense expense1,
			Expense expense2,
			Expense expense3,
			Expense expense4,
			Expense expense5,
			Expense expense6,
			Expense expense7) {
		this.expense1 = expense1;
		this.expense2 = expense2;
		this.expense3 = expense3;
		this.expense4 = expense4;
		this.expense5 = expense5;
		this.expense6 = expense6;
		this.expense7 = expense7;
	}

	double add() {
		return expense1.amount() + expense2.amount() + expense3.amount() + expense4.amount() + expense5.amount()
				+ expense6.amount() + expense7.amount();
	}
}
