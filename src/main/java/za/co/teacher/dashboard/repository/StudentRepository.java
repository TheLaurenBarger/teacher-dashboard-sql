package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.StudentEntity;

@Repository("teacher.dashboard.StudentRepository")
public interface StudentRepository extends CrudRepository<StudentEntity, String> {
}
