package org.mael.stackoverflow.testing.stix;

public class StixBoard {
	public int number;

	public StixBoard(int number) {
		this.number = number;
	}

	public int getNumStix() {
		return number;
	}

	public boolean takeStix(int number) {
		int take = 1;
		while (take <= getNumStix()) {
			takeStix(take);
			take++;
		}

		if (number >= 1 && number <= 3) {
			number = number - this.number;
			System.out.println("Number of sticks on board:" + number);
			return (true);
		} else
			System.out.println("Illegeal Move");
		return (false);
	}

	public boolean isGameOver() {
		if (number >= 1) {
			return (true);
		} else
			return false;
	}

	public String toString() {
		return (getNumStix() + " Stix Remaining.");
	}
}