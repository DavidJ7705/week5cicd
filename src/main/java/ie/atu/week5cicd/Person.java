package ie.atu.week5cicd;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @PositiveOrZero(message = "Employee ID cannot be blank")
    private int employeeid;

    @Min(value=15,message ="Age must be greater than 15")
    private int age;

    @Email(message = "Invalid Email Address")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;


}
