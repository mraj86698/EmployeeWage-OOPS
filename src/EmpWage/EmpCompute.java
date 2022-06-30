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
	
	public void presentAbsent() {
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

	public void dailyWage() {
		if (empCheck == empPresent) {
			System.out.println("Employee is Present");
			System.out.println("Employee Daily Wage is : " + wagePerHour * fullTimeHour);
		} else if (empCheck == 2) {
			System.out.println("Employee is Absent");
		} else {
			System.out.println("Employee is part time");
			System.out.println("Employee Daily Wage is : " +  wagePerHour * partTimeHour );
		}
	}
	
	public void monthlyWage() {
		int day = 20;
		
		switch ((int)empCheck) {
		case 1:
			System.out.println("Total wage for a month is : " + wagePerHour * fullTimeHour * day);
			break;
		case 3:
			System.out.println("Total wage for a month is : " + wagePerHour * partTimeHour * day);
			break;
		case 2:
			System.out.println("The Employee is Absent ");
		}
	}

}
