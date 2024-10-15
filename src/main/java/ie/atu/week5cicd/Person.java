package ie.atu.week5cicd;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "title cannot be blank")
    private String title;

    @Min(value=1,message ="Age must be greater than 1")
    private String age;


    @Email(message = "Invalid Email Address")
    private String email;






}
