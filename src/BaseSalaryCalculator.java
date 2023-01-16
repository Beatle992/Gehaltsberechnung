public abstract class BaseSalaryCalculator {
    protected final DeveloperReport developerReports;

    public BaseSalaryCalculator(DeveloperReport developerReports) {
        this.developerReports = developerReports;
    }

    public abstract double calculateSalary();
}


