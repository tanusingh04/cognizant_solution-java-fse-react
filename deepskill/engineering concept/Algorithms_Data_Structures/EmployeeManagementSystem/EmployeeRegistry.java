package EmployeeManagementSystem;

public class EmployeeRegistry {
    private Employee[] employees;
    private int size;

    public EmployeeRegistry(int capacity) {
        this.employees = new Employee[capacity];
        this.size = 0;
    }

    // Add employee
    public boolean addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Error: Registry is full. Cannot add employee " + employee.getName());
            return false;
        }
        employees[size] = employee;
        size++;
        System.out.println("Employee added successfully: " + employee.getName());
        return true;
    }

    // Search employee by ID
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        if (size == 0) {
            System.out.println("No employees in registry.");
            return;
        }
        System.out.println("\n--- Employee List ---");
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete employee by ID
    public boolean deleteEmployee(String employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                String removedName = employees[i].getName();
                // Shift elements to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null; // Clear last element reference
                size--;
                System.out.println("Employee deleted successfully: " + removedName);
                return true;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
        return false;
    }
}
