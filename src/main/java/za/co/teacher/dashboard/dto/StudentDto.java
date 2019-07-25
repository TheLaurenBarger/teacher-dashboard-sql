package za.co.teacher.dashboard.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "studentId",
        "name"})
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentDto implements Serializable {

    @ApiModelProperty(name = "student-id", example = "22",
            notes = "The unique number associated with a student")
    @JsonProperty(value = "student-id")
    @NotNull
    private String studentId;

    @ApiModelProperty(name = "name", example = "Jeff",
            notes = "The name of the student")
    @JsonProperty(value = "name")
    @NotNull
    private String name;

}
