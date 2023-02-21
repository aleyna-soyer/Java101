

public class Employee {
	private String name;
	private double salary;
	private int workHours;
	private int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public double tax() {
		
		if(this.salary>1000) {
			
			return (salary*3)/100;
		}
		return 0;
		
	}
	public int bonus() {
		if(this.workHours>40) {
			return (this.workHours-40)*30;
		}
		return 0;
	}
	public double raiseSalary() {
		int yr=2021-this.hireYear;
		
		if(yr<10) {
			return (salary*5)/100;
		}
		else if(9<yr && yr<20) {
			return (salary*20)/100;
		}
		else if(yr>19) {
			return (salary*15)/100;
		}
		return 0;
	}
	public String toString() {
		double total= this.salary+bonus()-tax();
		double totalSalary= this.salary+raiseSalary();
		System.out.println("Name: " + this.name + 
				" Salary: " + this.salary +
				" Work Hourse: " + this.workHours +
				" Hire Year: " + this.hireYear + 
				" Tax: " + tax() + 
				" Bonus: " + bonus() + 
				" Raise Salary: " + raiseSalary() + 
		        " Salary (with tax and bonus): " + total +
		        " Total Salary: " + totalSalary ); 
		return null;
	}
	
	

}
