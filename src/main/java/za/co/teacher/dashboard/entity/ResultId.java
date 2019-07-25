package za.co.teacher.dashboard.entity;

import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode
class ResultId implements Serializable {
    private static Long serialVersionUID = 1L;

    private int studentId;
    private int assignmentId;
}
