package Assignment;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int wagePerHour=20;
		int fullDayHour=8;
		int partTimeHour=4;
		int employeeWagePerDay = 0;
		int dayInMonth=20,day=0;
		int sallary=0;
		int present=0,parttime=0,absent=0;
		int totalhours=100,hours=0;
		while (hours < totalhours  && day <  dayInMonth) 
		{
			int ran = (int) (Math.random()*(3));
			if (hours == 96)
			{
				ran=2;
			}
		    switch(ran)
			{
			case 0: 
				absent++;
				employeeWagePerDay = 0;
				break;
			case 1: 
				present++;
				employeeWagePerDay = wagePerHour * fullDayHour;
				hours=hours+8;
				break;
			case 2: 
				parttime++;
				employeeWagePerDay = wagePerHour * partTimeHour;
				hours=hours+4;
				break;
			default: System.out.println(" ");
			}
			sallary=sallary+employeeWagePerDay;
		}
		System.out.println("total Present is :"+present);
		System.out.println("total Present part time is :"+parttime);
		System.out.println("total absent is :"+absent);
		System.out.println("EmployeeWage for a month is : "+sallary);
	}
}
