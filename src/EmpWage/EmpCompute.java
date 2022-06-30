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
	
	public void wage_till_condition() {
		int day_count = 1;
		int hour_count = 0;
		while (day_count != 20 && hour_count != 100) {
			int emp_check = (int) (Math.floor(Math.random() * 10) % 3+1);
			switch (emp_check) {
			case 1:
				day_count += 1;
				hour_count += fullTimeHour;
				break;
			case 3:
				day_count += 1;
				hour_count += partTimeHour;
				break;
			default:
				continue;
			}
		}
		System.out.println("The employee Total Working Hours : " + wagePerHour * hour_count * day_count);
	}

}
