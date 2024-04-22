package tag1.inheritence;

//import gfnSandbox.tag1.Manager;

class Employee {
	int gehalt;
	Employee(int gehalt) {
		this.gehalt = gehalt;
	}
	
	int getGehalt() {
		return this.gehalt;
	}
	void setGehalt(int gehalt) {
		this.gehalt = gehalt;
	}

	public static void main(String[] argv) {	
		Employee norbert = new Employee(300);	
		Manager frank = new Manager(300, 300);
		System.out.println(frank.getGehalt());
	}
}

