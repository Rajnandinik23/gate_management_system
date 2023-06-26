package springbootproject.com.gatepass_management_system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import springbootproject.com.gatepass_management_system.Entity.Student;
import springbootproject.com.gatepass_management_system.Service.studentService;

@Controller
public class studentController {
    @Autowired
    studentService service;
    @GetMapping("/")
    public String home(Model m)
    {
        List<Student> stud=service.listAllStudents();
        m.addAttribute("stud", stud);
        return "index";
    }
    @GetMapping("/add_student")
    public String addStudent()
    {
        return "add_student";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute Student m,HttpSession session)
    {
       
        String msg="Student saved sucessfully";
        session.setAttribute("msg", msg);
        service.saveStudentInfo(m);
        System.out.println(m);
        return "index";
    }
    @GetMapping("/edit/{rollNo}")
    public String edit(@PathVariable int rollNo,Model m)
    {
       Student e=service.getStudByID(rollNo);
       m.addAttribute("stud", e);
       return "edit";
    }
    @PostMapping("/update")
    public String updateEmp(@ModelAttribute Student e,HttpSession session)
    {
       service.saveStudentInfo(e);
       session.setAttribute("msg", "Employee Data Update Successfully");
       return "index";
    }
    @GetMapping("/delete/{rollNo}")
    public String deleteEmp(@PathVariable int rollNo,HttpSession session)
    {
      session.setAttribute("msg", "Employee Deleted Sucessfully");
      service.deleteStudByID(rollNo);
       return "index";
    }
}
