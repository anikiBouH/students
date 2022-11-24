package telran.java45.student.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import telran.java45.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	Stream<Student> findStudentsByNameIgnoreCase(String name);
	
	@Query("{'scores.?0':{$gt: ?1}}")
	Stream<Student> findStudentsByExamAndMinScoreGreaterThen(String exam, Integer minScore);

	Long countStudentsByNameIn(List<String> names);
 }
