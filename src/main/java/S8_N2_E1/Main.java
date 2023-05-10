package S8_N2_E1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ana", "María", "Anacleta", "Pepa", "Lola", "alisenda", "Ara"));

        List<String> namesStartingAUpperCase = names.stream()
                .filter(n -> (n.startsWith("A") && n.length()==3))
                .collect(Collectors.toList());

        System.out.println("Llista de noms que comencen per 'A' i tenen tres lletres:\n\t"+namesStartingAUpperCase);
    }
}
