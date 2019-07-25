package za.co.teacher.dashboard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "Student")
public class StudentEntity {

    @Id
    private String studentId;

    private String name;

    @OneToMany
    private List<AssignmentEntity> assignments = new ArrayList<>();

}