package com.tts.myAwesomeProject.repository;
import java.util.List;
import com.tts.myAwesomeProject.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
    List<Customer> findByLastName(String lastName);
}




