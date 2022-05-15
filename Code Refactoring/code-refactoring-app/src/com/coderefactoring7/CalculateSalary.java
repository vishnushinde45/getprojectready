package com.coderefactoring7;

//If you needed to figure out the pay for different
//employees, you'd have to perform many conditional 
//checks to see if they get a bonus, or not.
//It would also require code writing any time a special
//circumstance occurred. The strategy pattern eliminates that

public class CalculateSalary {

	public static void main(String[] args) {

		// This seems to work as long as there are no changes
		// I could make subclasses to eliminate the need for the boolean

		Employees salesman = new Employees(15000.00, true);

		System.out.println(salesman.getSalary());

		Employees secretary = new Employees(20000.00, false);

		System.out.println(secretary.getSalary());


	}

}

class Employees {

	private boolean bonus = false;
	private double salary = 0.0;

	

	private double bonusAmount = .15;

	public Employees(double salary, boolean bonus, double bonusAmount) {
		super();
		this.salary = salary;
		this.bonus = bonus;
		this.bonusAmount = bonusAmount;
	}

	public Employees(double salary, boolean bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}

	public Employees() {
	}

	public double getSalary() {

		if (bonus) {

			// CHANGED return salary + (salary*.15);

			return salary + (salary * bonusAmount);

		}

		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

