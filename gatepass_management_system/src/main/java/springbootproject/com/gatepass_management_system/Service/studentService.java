package springbootproject.com.gatepass_management_system.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbootproject.com.gatepass_management_system.Entity.Student;
import springbootproject.com.gatepass_management_system.Repository.studentRepository;

@Service
public class studentService {
@Autowired
private studentRepository repository;

   public void saveStudentInfo(Student s)
   {
     repository.save(s);
   }
   public List<Student> listAllStudents()
   {
     return repository.findAll();
   }
public Student getStudByID(int id) {
    return repository.findById(id).get();
}
public void deleteStudByID(int id) {
    repository.deleteById(id);
}

}
