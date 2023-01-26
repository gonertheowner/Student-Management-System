package projects.babich.studentmanagementsystem.service;

import projects.babich.studentmanagementsystem.entity.Student;
import projects.babich.studentmanagementsystem.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher saveTeacher(Teacher teacher);
    Teacher getTeacherById(Long id);
    Teacher updateTeacher(Teacher teacher);
    void deleteTeacherById(Long id);
}
