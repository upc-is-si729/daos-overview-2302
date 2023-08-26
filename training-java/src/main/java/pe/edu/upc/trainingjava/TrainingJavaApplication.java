package pe.edu.upc.trainingjava;

import pe.edu.upc.trainingjava.example.domain.model.entity.Student;

import java.util.Calendar;

public class TrainingJavaApplication {


  public static void main(String[] args) {
    System.out.println("Hello developers");

    Student carlos = new Student(1, "202210236", "Chura",
        "Carlos", Calendar.getInstance().getTime());

    System.out.println(carlos);
  }
}
