package SOLID_PRINCIPLES;

public class SingleResponsibilityPrinciple {
    public static class Employee {
        private String name;
        private String id;
        private double salary;

        // Constructor, getters, setters...
    }

    public static class EmployeeRepository {
        public void save(Employee employee) {
            // Database saving logic
        }
    }

    public static class TaxCalculator {
        public double calculateTax(Employee employee) {
         return 0;   // Tax calculation logic
        }
    }

    public static class ReportGenerator {
        public void generateReport(Employee employee) {
            // Report generation logic
        }
    }
}
