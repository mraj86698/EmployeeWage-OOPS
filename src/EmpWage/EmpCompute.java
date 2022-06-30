package EmpWage;

public class EmpCompute {
	int empPresent = 1;
	int wagePerHour = 20;
	int fullTimeHour = 8;
	int partTimeHour = 4;
	double empCheck;

	public EmpCompute() {
		empCheck = Math.floor(Math.random() * 10) % 3 + 1;
	}
	
	public void present_absent() {
		System.out.println("welcome to employee wage computation");
		if (empCheck == empPresent) {
			System.out.println("The Employee is Present");

		} else if (empCheck == 2) {
			System.out.println("The Employee is Absent");
		}
		else {
			System.out.println("The employee is present but he is part time");
		}
	}

	public void daily_wage() {
		if (empCheck == empPresent) {
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage is : " + wagePerHour * fullTimeHour);
		} else  {
			System.out.println("Employee is Absent");
		}
	}

}
