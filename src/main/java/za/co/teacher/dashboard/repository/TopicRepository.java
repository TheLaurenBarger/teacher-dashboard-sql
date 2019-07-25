package za.co.teacher.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.teacher.dashboard.entity.TopicEntity;

@Repository("teacher.dashboard.TopicRepository")
public interface TopicRepository extends CrudRepository<TopicEntity, String> {
}
