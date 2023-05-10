package S8_N2_E2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4,8,7,5,15,22));

        String cadena = list.stream() //Stream<Integer>
                .map(n -> (n % 2 == 0 ? "e" : "o") + n)  //Stream<String>
                .collect(Collectors.joining(", "));

        System.out.println("La cadena a retornar és: \""+cadena+"\"");


    }

}
