package Course.SpringDataJpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mypkg.jpa_hibernate.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Integer>{

	
}
