package projects.babich.studentmanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import projects.babich.studentmanagementsystem.entity.Student;
import projects.babich.studentmanagementsystem.entity.Teacher;
import projects.babich.studentmanagementsystem.service.TeacherService;

@Controller
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teachers")
    public String listStudents(Model model) {
        model.addAttribute("teachers", teacherService.getAllTeachers());
        return "teacher/teachers";
    }

    @GetMapping("/teachers/new")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        model.addAttribute("teacher", teacher);
        return "teacher/create_teacher";
    }

    @PostMapping("/teachers")
    public String saveTeacher(@ModelAttribute("teacher") Teacher teacher) {
        teacherService.saveTeacher(teacher);
        return "redirect:/teachers";
    }

    @GetMapping("/teachers/edit/{id}")
    public String editTeacherForm(@PathVariable Long id, Model model) {
        model.addAttribute("teacher", teacherService.getTeacherById(id));
        return "teacher/edit_teacher";
    }

    @PostMapping("/teachers/update/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("teacher") Teacher teacher) {
        Teacher existingTeacher = teacherService.getTeacherById(id);
        existingTeacher.setId(teacher.getId());
        existingTeacher.setFirstName(teacher.getFirstName());
        existingTeacher.setLastName(teacher.getLastName());
        existingTeacher.setSubject(teacher.getSubject());

        teacherService.updateTeacher(existingTeacher);

        return "redirect:/teachers";
    }

    @GetMapping("/teachers/delete/{id}")
    public String deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
        return "redirect:/teachers";
    }
}