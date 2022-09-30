package EmployeeWageComputation;

import java.util.Random;

public class EmployeeWageComputation {

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHour = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation ");

		// Employee attendance

		Random inp = new Random();
		int empPresent = inp.nextInt(2);

		if (empPresent == 0) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
		int dailyWage = 0;
		int dailyWage2 = 0;

		dailyWage = fullDayHour * wagePerHour;
		System.out.println("Daily wage of Employee is " + dailyWage);

		// employee part time

		dailyWage = partTimeHour * wagePerHour;
		System.out.println("Employee is Part time");

		// Switch case

		dailyWage2 = partTimeHour * 10;

		empPresent = inp.nextInt(2);
		switch (empPresent) {
		case 0:
			System.out.println("Employee is Present");
			break;
		case 1:
			System.out.println("Employee is Part Time");
			break;
		case 2:
			System.out.println("Employee is Absent");
			break;

		}

		// Monthly Wage Employee

		int monthlyWage = 0;
		int monthDays = 20;

		monthlyWage = dailyWage * monthDays;
		System.out.println("Monthly wage of Employee is " + monthlyWage);

		monthlyWage = dailyWage2 * monthDays;
		System.out.println("Monthly wage of part time Employee is " + monthlyWage);

	}

}
