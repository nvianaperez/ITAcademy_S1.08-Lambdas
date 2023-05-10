package S8_N1_E3_E4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        String[] monthsOfYear = {"Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"};
//        List<String> list3 = new ArrayList<>();
//        list3.addAll(Arrays.asList(monthsOfYear));

        List<String> monthsOfYear2 = new ArrayList<>(Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"));

        monthsOfYear2.stream()
                .forEach( m -> System.out.println(m));

        System.out.println("******** Method reference *********");
        monthsOfYear2.stream()
                .forEach(System.out::println);
    }
}
