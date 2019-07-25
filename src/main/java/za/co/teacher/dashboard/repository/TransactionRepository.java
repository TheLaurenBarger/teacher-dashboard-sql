package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.TransactionEntity;

@Repository("teacher.dashboard.TransactionRepository")
public interface TransactionRepository extends CrudRepository<TransactionEntity, String> {
}
