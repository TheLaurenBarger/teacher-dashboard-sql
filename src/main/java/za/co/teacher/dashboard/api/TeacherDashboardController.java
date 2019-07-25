package za.co.teacher.dashboard.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.co.teacher.dashboard.dto.StudentDto;
import za.co.teacher.dashboard.exceptions.NotFoundException;
import za.co.teacher.dashboard.repository.AssignmentRepository;
import za.co.teacher.dashboard.repository.ResultRepository;
import za.co.teacher.dashboard.repository.StudentRepository;
import za.co.teacher.dashboard.repository.TopicRepository;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@RestController("teacher.dashboard.TeacherDashboardController")
@RequestMapping(value = "/api")
@WebService(serviceName = "TeacherDashboard", name = "TeacherDashboard", targetNamespace = "http://teacher.dashboard")
@Slf4j
@SuppressWarnings("Duplicates")
public class TeacherDashboardController {
    private AssignmentRepository assignmentRepository;
    private ResultRepository resultRepository;
    private StudentRepository studentRepository;
    private TopicRepository topicRepository;

    @Autowired
    public TeacherDashboardController(
            @Qualifier("teacher.dashboard.AssignmentRepository") AssignmentRepository assignmentRepository,
            @Qualifier("teacher.dashboard.ResultRepository") ResultRepository resultRepository,
            @Qualifier("teacher.dashboard.TopicRepository") TopicRepository topicRepository,
            @Qualifier("teacher.dashboard.StudentRepository") StudentRepository studentRepository) {
        this.assignmentRepository = assignmentRepository;
        this.resultRepository = resultRepository;
        this.studentRepository = studentRepository;
        this.topicRepository= topicRepository;
    }

    @ApiOperation(value = "Retrieve students", notes = "Retrieve a list of all students")
    @RequestMapping(value = "/students/{student-id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @WebMethod(operationName = "GetStudent")
    @WebResult(name = "Student")
    public StudentDto getStudent(
            @ApiParam(name = "student-id", value = "The student id", required = true)
            @PathVariable(name = "student-id") String studentId )
            throws NotFoundException {

        var studentOptional = studentRepository.findById(studentId);

        if (studentOptional.isEmpty()) {
            log.info("STUDENT [{}] NOT FOUND", studentId);
            throw new NotFoundException("Student not Found");
        }

        var student = studentOptional.get();

        return StudentDto.builder()
                .studentId(student.getStudentId())
                .name(student.getName())
                .build();
    }
}
