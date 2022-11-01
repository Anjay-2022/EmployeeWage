package Assignment;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int ran=(int) (Math.random()*(2));
		System.out.println(ran);
		if (ran == 0) {
			System.out.println("employee is Absent");
		} else if (ran == 1) {
			System.out.println("employee is Present");
		}

	}

}
