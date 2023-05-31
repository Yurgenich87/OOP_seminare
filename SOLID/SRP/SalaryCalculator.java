package SOLID.SRP;

public class SalaryCalculator {
	public int calculateNetSalary(Employee employee) {
		int baseSalary = employee.getBaseSalary();
		int tax = (int) (baseSalary * 0.25); // calculate in other way
		return baseSalary - tax;
	}
}
