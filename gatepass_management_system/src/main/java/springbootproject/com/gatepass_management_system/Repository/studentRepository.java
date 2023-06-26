package springbootproject.com.gatepass_management_system.Repository;

import org.springframework.stereotype.Repository;

import springbootproject.com.gatepass_management_system.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface studentRepository extends JpaRepository<Student,Integer>{
    
}
