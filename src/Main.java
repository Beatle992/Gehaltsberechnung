import java.util.*;

public class Main {
    public static void main(String[] args) {

        BaseSalaryCalculator[] reps = {
                new SeniorSalaryCalculator(new DeveloperReport("Becki", "Senior Developer", 30.5, 160)),
                new JuniorSalaryCalculator(new DeveloperReport("Leo", "Junior Developer", 20, 150)),
                new SeniorSalaryCalculator(new DeveloperReport("MeM", "Senior Developer", 30.5, 180)),
                new ProjectOfficer(new DeveloperReport("Wolfgang", "Project Officer", 20, 120)),
                new Tester(new DeveloperReport("Luis", "Tester", 20, 120))
        };

        ArrayList<BaseSalaryCalculator> calc = new ArrayList<>(Arrays.asList(reps));

        SalaryCalculator calculator = new SalaryCalculator(calc);
        System.out.println("Sum of all salaries of our devs: " + calculator.calculateTotalSalaries()+ "€");

        JuniorSalaryCalculator junior = new JuniorSalaryCalculator(new DeveloperReport("Leo", "Junior Developer", 20, 150));
        junior.printSalary();

        Tester tester = new Tester(new DeveloperReport("Becki", "Senior Developer", 30.5, 160));
        tester.printSalary();

        ProjectOfficer projectOfficer = new ProjectOfficer(new DeveloperReport("MeJ", "Project Officer", 20, 120));
        projectOfficer.printSalary();

        SeniorSalaryCalculator senior = new SeniorSalaryCalculator(new DeveloperReport("MeM", "Senior Developer", 30.5, 180));
        senior.printSalary();

    }
}