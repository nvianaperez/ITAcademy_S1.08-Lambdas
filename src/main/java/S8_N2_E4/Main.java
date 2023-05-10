package S8_N2_E4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>(Arrays.asList("Pramara cadana", "Segona cadena", "Tarcara cadana","Alguna cadena",2,8,6,7));

        List<String> listSortedAlphabetically = list.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        System.out.println("La llista de Strings ordenada alfabèticament: \n\t"+listSortedAlphabetically);
        System.out.println("**********************");

        list.sort((o1, o2) -> {
                String s1 = o1.toString();
                String s2 = o2.toString();
                if (s1.contains("e") && !s2.contains("e")) {
                    return -1;
                } else if (!s1.contains("e") && s2.contains("e")) {
                    return 1;
                } else {
                    return s1.compareTo(s2);
                }
        });

        System.out.println("La llista transformada a Strings i ordenada per \"conté la 'e'\"\n\t"+list);
        System.out.println("**********************");

        List<String> listReplaceABy4 = list.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .map(e -> e.contains("a") ? e.replace("a","4") : e)
//                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Els elements de la llista reemplaçant \"a\" per \"4\" és: "+listReplaceABy4);
        System.out.println("**********************");

        List<Number> listOnlyNumbers = list.stream()
                .filter(e -> e instanceof Number)
                .map(e -> (Number) e)
//                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Els elements de la llista que son numèrics son: "+listOnlyNumbers);
        System.out.println("**********************");

        List<String> listOnlyNumbersWhenSavedAsStrings = list.stream()
                .map(e -> e.toString())
                .filter(e -> e.matches("[0-9]*"))
                .collect(Collectors.toList());

        System.out.println("Els elements de la llista de Strings que son numèrics son: "+listOnlyNumbersWhenSavedAsStrings);
        System.out.println("**********************");

    }

}

//        //Option 2
//        List<String> listStrings = new ArrayList<>();
//        for (Object e : list) {
//            if (e instanceof String) {
//                listStrings.add((String)e);
//            }
//        }
//
//        Comparator<String> comparador = (String s1, String s2) -> s1.compareTo(s2);
//        listStrings.sort(comparador);
//        for (String e : listStrings) {
//            System.out.println(e);
//        }