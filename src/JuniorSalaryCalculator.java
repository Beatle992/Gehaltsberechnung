import java.util.ArrayList;
public class JuniorSalaryCalculator extends BaseSalaryCalculator {

    public JuniorSalaryCalculator(DeveloperReport developerReports) {
        super(developerReports);
    }

    public double calculateSalary() {
        return developerReports.getHourlyRate() * developerReports.getWorkingHours();

    }
    public void printSalary() {
        System.out.println("The salary of the junior developer is: " + calculateSalary());
    }
}