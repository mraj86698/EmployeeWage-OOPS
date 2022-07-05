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
		} else {
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
			System.out.println("Employee Daily Wage is : " + wagePerHour * partTimeHour);
		}
	}

	public void monthlyWage() {
		int day = 20;

		switch ((int) empCheck) {
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
//		int day_count = 1;
//		int hour_count = 0;
//		while (day_count != 20 && hour_count != 100) {
//			int emp_check = (int) (Math.floor(Math.random() * 10) % 3+1);
//			switch (emp_check) {
//			case 1:
//				day_count += 1;
//				hour_count += fullTimeHour;
//				break;
//			case 3:
//				day_count += 1;
//				hour_count += partTimeHour;
//				break;
//			default:
//				continue;
//			}
//		}
//		System.out.println("Wages of the month : " + wagePerHour * hour_count * day_count);
//	}

		final int part_Time = 2;
		final int full_Time = 1;
		final int wage_per_Hour = 20;
		final int WorkingDayInMonth = 20;
		final int WorkingHourPerMonth = 100;

		int total_Wage = 0;

		int dailyWages = 0;
		int MonthlyWages = 0;
		int workingDay = 1;
		int day = 1;
		int absent = 0;
		int working_Hours = 0;
		int totalWorkingHoursInMonth = 0;
		System.out.printf("%5s		%5s		%5s		%5s\n", "Day", "Working_Hours", "daily Wage","Total_Working_Hours\n\n");

		for (int workingday = 1; day <= WorkingDayInMonth
				&& totalWorkingHoursInMonth < WorkingHourPerMonth; workingday++) {
			int empType = (int) (Math.random() * 100) % 3;

			switch (empType) {

			case full_Time:
				System.out.println("Employee is Present FullTime\n");
				working_Hours = 8;
				dailyWages = working_Hours * wage_per_Hour;

				break;

			case part_Time:
				System.out.println("Employee Present PartTime\n");
				working_Hours = 4;
				break;

			default:
				System.out.println("Employee is Absent\n");
				working_Hours = 0;
				break;

			}
			dailyWages = working_Hours * wage_per_Hour;
			MonthlyWages = dailyWages + MonthlyWages;
			totalWorkingHoursInMonth = totalWorkingHoursInMonth + working_Hours;

			System.out.printf("%5d		%5d		%5d		%5d\n", day, working_Hours, dailyWages,totalWorkingHoursInMonth);
		}

		System.out.println("Total Working Hours of the Month : " + totalWorkingHoursInMonth + "Hours");
		System.out.println();
		System.out.println("Total wage for a month :  " + MonthlyWages);
	}

}
