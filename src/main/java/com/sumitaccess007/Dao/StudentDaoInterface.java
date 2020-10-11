package com.sumitaccess007.Dao;

import com.sumitaccess007.Entity.Student;

import java.util.Collection;

public interface StudentDaoInterface {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudentToDb(Student student);
}
