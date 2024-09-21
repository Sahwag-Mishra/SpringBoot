package CourseJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.mypkg.jpa_hibernate.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class courseJpaRepository
{
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}

	
	public Course findById(int id)
	{
		return entityManager.find(Course.class,id);
		
	}
	
	public void deleteById(int id)
	{
		Course course = entityManager.find(Course.class,id);
		entityManager.remove(course);
	}
}
