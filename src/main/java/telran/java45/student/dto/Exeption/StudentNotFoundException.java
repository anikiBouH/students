package telran.java45.student.dto.Exeption;

import java.io.Serializable;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public StudentNotFoundException(int id) {
		super("Student " + id + "not found");
	}
	
}
