package pe.edu.upc.trainingjava.juanflores2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //numbers.forEach(System.out::println);
        numbers.stream()
                .filter(a -> (a % 2)==0)
                .map(b -> b * 2)
                .collect(Collectors.toList())
                .forEach(c -> System.out.println(c));
    }
}
