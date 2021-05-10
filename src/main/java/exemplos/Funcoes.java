package exemplos;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> returNameOuter = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> convertStringForInteger = string -> Integer.valueOf(string) * 2;
        System.out.println(returNameOuter.apply("coca-cola"));
        System.out.println(convertStringForInteger.apply("20"));
    }
}
