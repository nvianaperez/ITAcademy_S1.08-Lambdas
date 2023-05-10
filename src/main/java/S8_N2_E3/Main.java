package S8_N2_E3;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Operacio suma = (num1, num2) -> num1+num2;
        Operacio resta = (num1, num2) -> num1-num2;
        Operacio multiplicacio = (num1, num2) -> num1*num2;
        Operacio divisio = (num1, num2) -> {
            if(num2==0) {
                throw new IllegalArgumentException("No es pot dividir entre 0");
            }
            return num1/num2;
        };

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Suma: "+String.format("%.2f",suma.operacio(5.5f,3.5f)));
        System.out.println("Resta: "+String.format("%.2f",resta.operacio(5.5f,3.5f)));
        System.out.println("Multiplicació: "+decimalFormat.format(multiplicacio.operacio(5.5f,3.5f)));
        System.out.println("Divisió: "+String.format("%.2f",divisio.operacio(5.5f,3.5f)));
    }

}
