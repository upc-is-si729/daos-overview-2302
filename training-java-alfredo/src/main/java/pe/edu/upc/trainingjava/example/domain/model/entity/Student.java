package pe.edu.upc.trainingjava.example.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Student extends Person{ //Upper Camel Case
    private Integer id;
    private String tiu;

    public Student(String lastName, String firstName, Date birthday, Integer id, String tiu) {
        super(lastName, firstName, birthday);
        this.id = id;
        this.tiu = tiu;
    }
    @Override
    public String toString(){
        return "["+this.getId()+"]:"+this.getTiu()+"-"+this.getLastName()
                +" "+this.getFirstName();
    }
}
