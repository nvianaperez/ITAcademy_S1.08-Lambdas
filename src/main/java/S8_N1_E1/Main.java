package S8_N1_E1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hola");
        list.add("Adéu");
        list.add("Mundo");
        list.add("Olé");

        List<String> listContainO = list
                .stream()
                .filter( s -> s.toLowerCase().contains("o") )
                .collect(Collectors.toList());

        System.out.println(listContainO);

    }
}
