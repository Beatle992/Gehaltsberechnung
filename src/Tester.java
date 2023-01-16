public class Tester extends BaseSalaryCalculator{
    public Tester(DeveloperReport developerReports) {
        super(developerReports);
    }
    public double calculateSalary() {
        return developerReports.getHourlyRate() * developerReports.getWorkingHours() * 2;
    }

    public void printSalary() {
        System.out.println("The salary of the tester is: " + calculateSalary());
    }
}
