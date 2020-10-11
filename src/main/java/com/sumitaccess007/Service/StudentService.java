package com.sumitaccess007.Service;

import com.sumitaccess007.Dao.StudentDao;
import com.sumitaccess007.Dao.StudentDaoInterface;
import com.sumitaccess007.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    @Qualifier("fakedata")
    private StudentDaoInterface studentDaoInterface;

    public Collection<Student> getAllStudents() {
        return this.studentDaoInterface.getAllStudents();
    }

    public Student getStudentById(int id) { return this.studentDaoInterface.getStudentById(id); }

    public void removeStudentById(int id) {
        this.studentDaoInterface.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDaoInterface.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDaoInterface.insertStudentToDb(student);
    }
}
