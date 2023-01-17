package projects.babich.studentmanagementsystem.controller;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.stereotype.Controller;
import projects.babich.studentmanagementsystem.service.TeacherService;

@Controller
public class TeacherController {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
}
