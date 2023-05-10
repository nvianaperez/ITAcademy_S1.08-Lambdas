package S8_N1_E8;

public class Main {
    public static void main(String[] args) {

        //Option 1: create a new StringBuilderObject and use reverse()
        Reverse interficie = (s) -> new StringBuilder(s).reverse().toString();
        System.out.println(interficie.stringReverse("Hola Mundo"));

        //Option 2: for loop and charAt()
        Reverse interficie2 = (s) -> {
            String stringReverse ="";
            for (int i = s.length()-1; i>=0; i--) {
                stringReverse += s.charAt(i);
            }
            return stringReverse;
        };
        System.out.println(interficie2.stringReverse("A por el miércoles!"));

    }
}


