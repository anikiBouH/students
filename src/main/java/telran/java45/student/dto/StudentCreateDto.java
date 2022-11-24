package telran.java45.student.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@ToString
public class StudentCreateDto {
	 Integer id;
	 String name;
	 String password;
}
