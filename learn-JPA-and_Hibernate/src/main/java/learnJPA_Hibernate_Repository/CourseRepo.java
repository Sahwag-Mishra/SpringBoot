package learnJPA_Hibernate_Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.mypkg.jpa_hibernate.Course;

@Repository
public interface CourseRepo extends CrudRepository<Course,Integer>
{
	
}
