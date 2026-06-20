package MVCPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing MVC Pattern ===");

        // 1. Fetch student record (simulate database call)
        Student model = retrieveStudentFromDatabase();

        // 2. Create a view to write student details on console
        StudentView view = new StudentView();

        // 3. Create the Controller
        StudentController controller = new StudentController(model, view);

        // 4. Initial View Render
        System.out.println("\n--- Initial View ---");
        controller.updateView();

        // 5. Update model data through Controller
        System.out.println("\n--- Updating Student Grade to 'A+' ---");
        controller.setStudentGrade("A+");

        // 6. Re-render View to show updated details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("S101", "Arjun Singh", "A");
    }
}
