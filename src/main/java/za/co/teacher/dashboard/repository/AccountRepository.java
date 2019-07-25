package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.AccountEntity;

@Repository("teacher.dashboard.AccountRepository")
public interface AccountRepository extends CrudRepository<AccountEntity, String> {
}
