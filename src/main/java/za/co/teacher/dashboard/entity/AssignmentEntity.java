package za.co.teacher.dashboard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "Assignment")
public class AssignmentEntity {

    @Id
    @GeneratedValue
    private int assignmentId;

    private String name;
    private float totalMarks;

}