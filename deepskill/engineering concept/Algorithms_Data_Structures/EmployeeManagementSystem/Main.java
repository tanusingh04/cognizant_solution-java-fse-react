package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeRegistry registry = new EmployeeRegistry(5);

        // 1. Create employees
        Employee emp1 = new Employee("E001", "Alice Smith", "Software Engineer", 85000);
        Employee emp2 = new Employee("E002", "Bob Jones", "Product Manager", 95000);
        Employee emp3 = new Employee("E003", "Charlie Brown", "QA Engineer", 70000);
        Employee emp4 = new Employee("E004", "Diana Prince", "UX Designer", 88000);

        // 2. Add employees
        System.out.println("=== Testing Add Employee ===");
        registry.addEmployee(emp1);
        registry.addEmployee(emp2);
        registry.addEmployee(emp3);
        registry.addEmployee(emp4);

        // 3. Traverse
        registry.traverseEmployees();

        // 4. Search
        System.out.println("\n=== Testing Search Employee ===");
        String searchId = "E003";
        Employee found = registry.searchEmployee(searchId);
        System.out.println("Search for ID " + searchId + ": " + (found != null ? found : "Not Found"));

        // 5. Delete
        System.out.println("\n=== Testing Delete Employee ===");
        registry.deleteEmployee("E002");
        registry.traverseEmployees();

        // 6. Attempt delete non-existent
        System.out.println("\n=== Testing Delete Non-Existent Employee ===");
        registry.deleteEmployee("E099");
    }
}
