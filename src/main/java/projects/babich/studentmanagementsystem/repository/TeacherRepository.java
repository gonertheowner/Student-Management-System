package projects.babich.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.babich.studentmanagementsystem.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
