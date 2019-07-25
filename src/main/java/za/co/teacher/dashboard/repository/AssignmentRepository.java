package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.AssignmentEntity;

@Repository("teacher.dashboard.AssignmentRepository")
public interface AssignmentRepository extends CrudRepository<AssignmentEntity, String> {
}
