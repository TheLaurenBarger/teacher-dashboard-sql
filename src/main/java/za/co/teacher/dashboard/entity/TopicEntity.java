package za.co.teacher.dashboard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "Topic")
public class TopicEntity {

    @Id
    @GeneratedValue
    private int topicId;

    private String name;
    private float weighting;

    @OneToMany
    private List<AssignmentEntity> assignments = new ArrayList<>();

}