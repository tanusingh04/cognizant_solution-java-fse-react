package DependencyInjectionExample;

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomerInfo(String id) {
        String info = customerRepository.findCustomerById(id);
        System.out.println(info);
    }
}
