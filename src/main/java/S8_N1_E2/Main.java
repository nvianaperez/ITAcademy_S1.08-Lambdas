package S8_N1_E2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list2 = new ArrayList<>();
        list2.add("Huelva");
        list2.add("Oporto");
        list2.add("Lisboa");
        list2.add("Madrid");
        list2.add("Barcelona");
        list2.add("Olé");

        List<String> listContainOAndMoreThanFiveChar = list2
                .stream()
                .filter( s -> (s.toLowerCase().contains("o") && s.length()>=5) )
                .collect(Collectors.toList());

        System.out.println(listContainOAndMoreThanFiveChar);
    }
}
