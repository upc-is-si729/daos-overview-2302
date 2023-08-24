package pe.edu.upc.trainingjava.example.domain.model.entitiy;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Student extends Person{
    private Integer id;
    private String tiu;

    public Student(Integer id, String tiu, String lastName, String firstName, Date birthday){
        super(lastName, firstName, birthday);
        this.id = id;
        this.tiu = tiu;

    }

    @Override
    public String toString(){
        return "[" + this.getId() + "]: " + this.getTiu() + " - " + this.getLastName()
                + " " + this.getFirstName();
    }
}
