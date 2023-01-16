import java.util.*;
public class SalaryCalculator {
    private final ArrayList<BaseSalaryCalculator> baseSalaryCalculators;

    public SalaryCalculator(ArrayList<BaseSalaryCalculator> baseSalaryCalculators) {
        this.baseSalaryCalculators = baseSalaryCalculators;
    }

    public double calculateTotalSalaries() {
        double totalSalaries = 0D;

        Iterator<BaseSalaryCalculator> iter = baseSalaryCalculators.iterator();
        while (iter.hasNext()) {
            BaseSalaryCalculator calculator = iter.next();
            totalSalaries += calculator.calculateSalary();
        }
        return totalSalaries;
    }
}
