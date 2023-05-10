package S8_N1_E6_E7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Object> list4 = new ArrayList<>();
        list4.add("Alba");
        list4.add("Franciscana");
        list4.add("María");
        list4.add(52);
        list4.add("Ra");

//        Less code lines but less eficient
//        List<?> list5 = new ArrayList<>(Arrays.asList("Juana", "Filomena", 65, 85, "Atapuerca", "Mia"));

        List<String> listSortedByLengthAsc = list4.stream()
                .filter( e -> e instanceof String )
                .map( e -> (String) e )
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());

        System.out.println("Llista de Strings ordenada de més curta a més llarga:\n\t"+listSortedByLengthAsc);

        List<String> listSortedByLengthDesc = listSortedByLengthAsc.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println("Llista de Strings ordenada de més llarga a més curta:\n\t"+listSortedByLengthDesc);
    }
}
