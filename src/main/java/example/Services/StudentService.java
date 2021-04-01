package example.Services;

import example.Model.Student;
import example.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String
    saveAndUpdateStudent(Student student){
        if (student.getId()!=null){
            Optional<Student> studentOptional = studentRepository.findById(student.getId());
            if (!studentOptional.isPresent())
                return "th given id is not exist ";
        }
        studentRepository.save(student);
        return "Task Completed";
    }

    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }
}
