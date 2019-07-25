package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.ResultEntity;

@Repository("teacher.dashboard.ResultRepository")
public interface ResultRepository extends CrudRepository<ResultEntity, String> {
}
