package org.jacobarchambault.travelexpenses;

public class Expenses {
	BasicExpense expense1;
	BasicExpense expense2;
	BasicExpense expense3;
	BasicExpense expense4;
	BasicExpense expense5;

	Expenses(
			BasicExpense expense1,
			BasicExpense expense2,
			BasicExpense expense3,
			BasicExpense expense4,
			BasicExpense expense5) {
		this.expense1 = expense1;
		this.expense2 = expense2;
		this.expense3 = expense3;
		this.expense4 = expense4;
		this.expense5 = expense5;
	}

	double add() {
		return expense1.amount() + expense2.amount() + expense3.amount() + expense4.amount() + expense5.amount();
	}
}
