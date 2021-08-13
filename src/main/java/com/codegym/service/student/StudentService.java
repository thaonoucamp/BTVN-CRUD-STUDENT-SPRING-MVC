package com.codegym.service.student;

import com.codegym.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService {
   static List<Student> list;
    static {
        list = new ArrayList<>();
        list.add(new Student(1L, "a", LocalDate.of(1990,06,26),"ha tay", "0812661990", "thao@gmail.com", "C0421K1"));
        list.add(new Student(2L, "b", LocalDate.of(1990,06,26),"ha tay", "0812661990", "thao@gmail.com", "C0421K1"));
        list.add(new Student(3L, "c", LocalDate.of(1990,06,26),"ha tay", "0812661990", "thao@gmail.com", "C0421K1"));
        list.add(new Student(4L, "d", LocalDate.of(1990,06,26),"ha tay", "0812661990", "thao@gmail.com", "C0421K1"));
        list.add(new Student(5L, "e", LocalDate.of(1990,06,26),"ha tay", "0812661990", "thao@gmail.com", "C0421K1"));
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = StudentService.list;
        for (Student s: students) {
            System.out.println(s.toString());
        }
        return students;
    }

    @Override
    public Student creat(Student student) {
        return null;
    }

    @Override
    public Student findByName(String name) {
        return null;
    }

    @Override
    public void update(Long id) {

    }

    @Override
    public void delete(Long id) {

    }
}
