package Assignment;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int ran=(int) (Math.random()*(3));
		int WagePerHour=20;
		int FullDayHour=8;
		int PartTimeHour=4;

		int EmployeeWage = 0;
		if (ran == 0) {
			System.out.println("employee is Absent");
			EmployeeWage=0;
		} else if (ran == 1) {
			System.out.println("employee is Present Full Time");
			EmployeeWage=WagePerHour*FullDayHour;
		} else if (ran == 2) {
			System.out.println("employee is Present Part Time");
			EmployeeWage=WagePerHour*PartTimeHour;
		}

		System.out.println("EmployeeWage is  :"+EmployeeWage); 
	}

}
