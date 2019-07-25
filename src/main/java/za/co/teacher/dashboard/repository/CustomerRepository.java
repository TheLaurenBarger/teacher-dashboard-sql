package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.CustomerEntity;

@Repository("teacher.dashboard.CustomerRepository")
public interface CustomerRepository extends CrudRepository<CustomerEntity, String> {
}
