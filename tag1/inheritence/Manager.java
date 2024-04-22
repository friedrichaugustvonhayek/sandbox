package tag1.inheritence;

//import gfnSandbox.tag1.Emplyee;

class Manager extends Employee {
	int budget;
	Manager(int gehalt, int budget) {
		super(gehalt);
		this.budget = budget;
	}
	
	int getBudget() {
		return this.budget;
	}

	void setBudget(int budget) {
		this.budget = budget;
	}
}
