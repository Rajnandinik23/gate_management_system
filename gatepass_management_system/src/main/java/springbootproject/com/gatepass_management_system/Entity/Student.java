package springbootproject.com.gatepass_management_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="GatePass_System")
public class Student {
    private String firstName;
    private String lastName;
    @Id
    private int rollNo;
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNo=" + rollNo + ", branch="
                + branch + ", reasonForLeave=" + reasonForLeave + ", classCordinatorName=" + classCordinatorName
                + ", time=" + time + "]";
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getReasonForLeave() {
        return reasonForLeave;
    }
    public void setReasonForLeave(String reasonForLeave) {
        this.reasonForLeave = reasonForLeave;
    }
    public String getClassCordinatorName() {
        return classCordinatorName;
    }
    public void setClassCordinatorName(String classCordinatorName) {
        this.classCordinatorName = classCordinatorName;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    private String branch;
    private String reasonForLeave;
    private String classCordinatorName;
    private String time;
    
}

