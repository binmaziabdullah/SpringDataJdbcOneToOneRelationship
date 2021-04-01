package example.Controllers;

import example.Model.Student;
import example.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public void saveAndUpdateStudent(@RequestBody Student student){
        studentService.saveAndUpdateStudent(student);
    }

    @GetMapping
    public Iterable<Student> findAll(){
       return  studentService.findAll();
    }
}
