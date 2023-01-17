package projects.babich.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projects.babich.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
