package pe.edu.upc.trainingjava.example.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Teacher extends Person {
  private Integer id;
  private String codigo;
}
