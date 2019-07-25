package za.co.teacher.dashboard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "Result")
@IdClass(ResultId.class)
public class ResultEntity {

    @Id
    private int studentId;
    @Id
    private int assignmentId;
    private float result;

}

