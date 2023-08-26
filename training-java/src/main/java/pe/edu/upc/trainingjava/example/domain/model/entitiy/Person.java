package pe.edu.upc.trainingjava.example.domain.model.entitiy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    private String lastName;
    private String firstName;
    private Date birthday;
}
