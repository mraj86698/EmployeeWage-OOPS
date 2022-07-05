package EmpWage;

import java.util.Scanner;

public class EmployeeWageComputation {

	public static void main(String[] args) {

		EmpCompute emp = new EmpCompute();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Options to show them:");

		while(true) {
			System.out.println("\n 1.Employee is absent or present\n 2.Employee daily wage\n 3.Employee monthly wage\n 4.Employee wage till conditiion");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				emp.presentAbsent();
				break;
			case 2:
				emp.dailyWage();
				break;
			case 3:
				emp.monthlyWage();
				break;
			case 4:
				emp.wage_till_condition();
				break;
			}
		}

	}

}
