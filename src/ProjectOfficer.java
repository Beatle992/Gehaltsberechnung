public class ProjectOfficer extends BaseSalaryCalculator {

    public ProjectOfficer(DeveloperReport developerReports) {
        super(developerReports);
    }
    public double calculateSalary() {
        return developerReports.getHourlyRate() * developerReports.getWorkingHours() * 1.7;
    }
    public void printSalary() {
        System.out.println("The salary of the project officer is: " + calculateSalary());
    }
}
