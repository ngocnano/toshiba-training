import java.util.Scanner;

public class PensionContributionCalculator {
	

	public static void main(String[] args) {
		// Declare constants
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		// TODO Auto-generated method stub
		// Declare variables
		int salary, age; // to be input
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter salary :");
		salary = scanner.nextInt();
		System.out.println("Enter age :");
		age = scanner.nextInt();
		
		// Check the contribution cap
		if (salary > 6000) {
			contributableSalary = 6000;
		} else {
			contributableSalary = salary;
		}
		// Compute various contributions in "double" using a nested-if to handle 4
		if (age <= 55) { // 55 and below
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
			totalContribution = employeeContribution + employerContribution;
		} else if (age <= 60) { // (60, 65]
			employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
			employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
			totalContribution = employeeContribution + employerContribution;

		} else if (age <= 65) { // (55, 60]
			employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
			employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
			totalContribution = employeeContribution + employerContribution;

		} else { // above 65
			employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
			employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
			totalContribution = employeeContribution + employerContribution;
		}
		// Alternatively,
		//if (age > 65) ......
		//else if (age > 60) ......
		//else if (age > 55) ......
		//else
		
		System.out.println("The employee's contribution is:" + employeeContribution);
		System.out.println("The employer's contribution is:" + employerContribution);
		System.out.println("The total contribution is:" + totalContribution);
		scanner.close();

	}

}
