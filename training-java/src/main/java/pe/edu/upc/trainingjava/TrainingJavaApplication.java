package pe.edu.upc.trainingjava;

import pe.edu.upc.trainingjava.example.domain.model.entitiy.Student;

import java.util.Calendar;

public class TrainingJavaApplication {
    public static void main(String[] args) {
        System.out.println("Hello developers");

        Student andres = new Student(1, "U201712256", "Doig", "Andres", Calendar.getInstance().getTime());

        System.out.println(andres);
    }
}
