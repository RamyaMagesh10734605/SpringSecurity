package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	List<Customer> findByEmail(String email);
	Customer save(Customer customer);
	

}
