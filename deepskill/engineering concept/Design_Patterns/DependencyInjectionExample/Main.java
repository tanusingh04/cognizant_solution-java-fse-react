package DependencyInjectionExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Dependency Injection ===");

        // 1. Create Concrete Repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // 2. Inject Repository into Service via Constructor Injection
        CustomerService service = new CustomerService(repository);

        // 3. Test Service methods
        System.out.println("\n--- Querying Customer C001 ---");
        service.displayCustomerInfo("C001");

        System.out.println("\n--- Querying Customer C002 ---");
        service.displayCustomerInfo("C002");

        System.out.println("\n--- Querying Non-Existent Customer C099 ---");
        service.displayCustomerInfo("C099");
    }
}
