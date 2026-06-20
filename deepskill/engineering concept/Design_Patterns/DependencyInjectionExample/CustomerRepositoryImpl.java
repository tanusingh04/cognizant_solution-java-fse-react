package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(String id) {
        // Mock DB fetch
        if ("C001".equals(id)) {
            return "Customer: John Doe (email: john.doe@example.com, tier: Premium)";
        } else if ("C002".equals(id)) {
            return "Customer: Jane Smith (email: jane.smith@example.com, tier: Standard)";
        } else {
            return "Customer with ID " + id + " not found.";
        }
    }
}
