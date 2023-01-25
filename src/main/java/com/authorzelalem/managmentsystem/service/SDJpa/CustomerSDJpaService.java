import java.util.*;
import .Repository.*;


@Service
@Profile("SDJpa")
public class CustomerSDJpaService implements CustomerService {

    private CustomerRepository customerRepository;
    private OrderRepository orderRepository;
    private ProductsRepository productsRepository;

   public CustomerSDJpaService( CustomerRepository customerRepository,
                                OrderRepository orderRepository, 
                                ProductsRepository productsRepository;){
                                    this.orderRepository = orderRepository;
                                    this.customerRepository = customerRepository;
                                    this.productsRepository = productsRepository;
                              }

    @Override
    public Customer findByLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }
    // @Override
    // public List<Customer> findAllByLastNameLike(String lastName) {
    //     return customerRepository.findAllByLastNameLike(lastName);
    // }
    // is it needed ????
    @Override
    public Set<Customer> findAll() {
        Set<Customer> customers = new HashSet<>();
        customerRepository.findAll().forEach(customers::add);
        return customers;
    }

    @Override
    public Customer findById(Long aLong) {
        return customerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Customer save(Customer object) {
        return customerRepository.save(object);
    }

    @Override
    public void delete(Customer object) {
        customerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        customerRepository.deleteById(aLong);
    }
}