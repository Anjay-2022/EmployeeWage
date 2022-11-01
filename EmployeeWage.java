package Assignment;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int ran=(int) (Math.random()*(2));
		int WagePerHour=20;
		int FullDayHour=8;

		int EmployeeWage = 0;
		if (ran == 0) {
			System.out.println("employee is Absent");
			EmployeeWage=WagePerHour*FullDayHour*ran;
		} else if (ran == 1) {
			System.out.println("employee is Present");
			EmployeeWage=WagePerHour*FullDayHour*ran;
		}
		System.out.println("EmployeeWage is  :"+EmployeeWage); 
	}
}
